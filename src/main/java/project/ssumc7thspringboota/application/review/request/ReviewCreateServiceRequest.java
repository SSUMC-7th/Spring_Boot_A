package project.ssumc7thspringboota.application.review.request;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReviewCreateServiceRequest {

  private final Long userId;
  private final Long storeId;
  private final Double rating;
  private final String reviewText;
  private final Set<Long> reviewPhotoIds;
}
