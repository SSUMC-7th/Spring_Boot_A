package project.ssumc7thspringboota.application.store.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StoreCreateResponse {

  private final Long id;
  private final String name;
  private final Double overallRating;
  private final String location;
}
