package project.ssumc7thspringboota.application.review;

import java.util.List;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.review.request.ReviewCreateServiceRequest;
import project.ssumc7thspringboota.application.review.response.ReviewCreateResponse;
import project.ssumc7thspringboota.application.review.response.ReviewListResponse;
import project.ssumc7thspringboota.domain.review.Review;
import project.ssumc7thspringboota.domain.review.reviewphoto.ReviewPhoto;
import project.ssumc7thspringboota.domain.review.reviewphoto.repository.ReviewPhotoRepository;
import project.ssumc7thspringboota.domain.store.Store;
import project.ssumc7thspringboota.domain.store.repository.StoreRepository;
import project.ssumc7thspringboota.domain.user.User;
import project.ssumc7thspringboota.domain.user.repository.UserRepository;
import project.ssumc7thspringboota.domain.review.repository.ReviewRepository;
import project.ssumc7thspringboota.exception.BusinessException;
import project.ssumc7thspringboota.exception.ErrorCode;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {

  private final ReviewRepository reviewRepository;
  private final UserRepository userRepository;
  private final StoreRepository storeRepository;
  private final ReviewPhotoRepository reviewPhotoRepository;

  @Transactional
  public ReviewCreateResponse createReview(ReviewCreateServiceRequest request) {
    User user = userRepository.findById(request.getUserId())
                              .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));
    Store store = storeRepository.findById(request.getStoreId())
                                 .orElseThrow(() -> new BusinessException(ErrorCode.STORE_NOT_FOUND));

    Set<ReviewPhoto> reviewPhotos = request.getReviewPhotoIds().stream()
                                           .map(reviewPhotoRepository::findById)
                                           .filter(Optional::isPresent)
                                           .map(Optional::get)
                                           .collect(Collectors.toSet());

    Review review = Review.builder()
                          .user(user)
                          .store(store)
                          .rating(request.getRating())
                          .reviewText(request.getReviewText())
                          .reviewPhotos(reviewPhotos)
                          .build();

    Review savedReview = reviewRepository.save(review);

    return ReviewCreateResponse.from(savedReview);
  }

  public Page<ReviewListResponse> getUserReviews(Long userId, PageRequest pageRequest) {
    User user = userRepository.findById(userId)
                              .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));

    Page<Review> reviews = reviewRepository.findByUserId(user.getId(), pageRequest);
    if (reviews.isEmpty()) {
      throw new BusinessException(ErrorCode.REVIEW_NOT_FOUND);
    }

    return reviews.map(ReviewListResponse::from);
  }
}
