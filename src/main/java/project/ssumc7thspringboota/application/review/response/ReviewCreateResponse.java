package project.ssumc7thspringboota.application.review.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReviewCreateResponse {

  private final Long id;
  private final Long storeId;
  private final Long userId;
  private final Double rating;
}
