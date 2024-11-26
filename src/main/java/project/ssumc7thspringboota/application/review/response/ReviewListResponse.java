package project.ssumc7thspringboota.application.review.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.review.Review;

@Getter
@Builder
public class ReviewListResponse {

  private final Long id;
  private final Long storeId;
  private final String storeName;
  private final Double rating;
  private final String reviewText;

  public static ReviewListResponse from(Review review) {
    return ReviewListResponse.builder()
                             .id(review.getId())
                             .storeId(review.getStore().getId())
                             .storeName(review.getStore().getName())
                             .rating(review.getRating())
                             .reviewText(review.getReviewText())
                             .build();
  }
}
