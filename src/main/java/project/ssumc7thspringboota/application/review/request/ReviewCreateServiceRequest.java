package project.ssumc7thspringboota.application.review.request;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewCreateServiceRequest {

  private Long userId;
  private Long storeId;
  private Double rating;
  private String reviewText;
  private Set<Long> reviewPhotoIds;

  @Builder
  private ReviewCreateServiceRequest(Long userId, Long storeId, Double rating, String reviewText,
      Set<Long> reviewPhotoIds) {
    this.userId = userId;
    this.storeId = storeId;
    this.rating = rating;
    this.reviewText = reviewText;
    this.reviewPhotoIds = reviewPhotoIds;
  }
}
