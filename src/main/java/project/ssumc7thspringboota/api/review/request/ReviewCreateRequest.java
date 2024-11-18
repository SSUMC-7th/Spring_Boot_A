package project.ssumc7thspringboota.api.review.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Set;
import lombok.Getter;
import project.ssumc7thspringboota.application.review.request.ReviewCreateServiceRequest;

@Getter
public class ReviewCreateRequest {

  @NotNull(message = "유저 ID를 입력해주세요.")
  private Long userId;

  @NotNull(message = "가게 ID를 입력해주세요.")
  private Long storeId;

  @NotNull(message = "평점을 입력해주세요.")
  private Double rating;

  @NotBlank(message = "리뷰 내용을 입력해주세요.")
  private String reviewText;

  private Set<Long> reviewPhotoIds;

  public ReviewCreateServiceRequest toServiceRequest() {
    return ReviewCreateServiceRequest.builder()
                                     .userId(userId)
                                     .storeId(storeId)
                                     .rating(rating)
                                     .reviewText(reviewText)
                                     .reviewPhotoIds(reviewPhotoIds)
                                     .build();
  }
}
