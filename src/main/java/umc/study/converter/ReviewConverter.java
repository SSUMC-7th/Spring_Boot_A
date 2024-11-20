package umc.study.converter;

import umc.study.domain.Member;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;


public class ReviewConverter {

    public static ReviewResponseDTO.ReviewDTO toReviewResultDTO(Review review) {
        return ReviewResponseDTO.ReviewDTO.builder()
                .reviewId(review.getId())
                .reviewDate(review.getCreatedAt())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.CreateReviewDTO reviewRequestDTO , Member member , Store store) {
        return Review.builder()
                .member(member)
                .score(reviewRequestDTO.getScore())
                .body(reviewRequestDTO.getBody())
                .store(store)
                .build();
    }
}
