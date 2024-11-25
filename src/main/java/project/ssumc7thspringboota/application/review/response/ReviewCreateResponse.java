package project.ssumc7thspringboota.application.review.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.review.Review;

@Getter
@Builder
public class ReviewCreateResponse {

  private final Long id;
  private final Long storeId;
  private final Long userId;
  private final Double rating;

  public static ReviewCreateResponse from(Review review) {
    return ReviewCreateResponse.builder()
                               .id(review.getId())
                               .storeId(review.getStore().getId())
                               .userId(review.getUser().getId())
                               .rating(review.getRating())
                               .build();
  }
}
