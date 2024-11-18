package project.ssumc7thspringboota.application.store.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.store.Store;

@Getter
@Builder
public class StoreCreateResponse {

  private final Long id;
  private final String name;
  private final Double overallRating;
  private final String location;

  public static StoreCreateResponse from(Store store) {
    return StoreCreateResponse.builder()
                              .id(store.getId())
                              .name(store.getName())
                              .overallRating(store.getOverallRating())
                              .location(store.getLocation())
                              .build();
  }
}
