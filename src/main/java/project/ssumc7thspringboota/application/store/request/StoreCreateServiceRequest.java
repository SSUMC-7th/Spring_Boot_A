package project.ssumc7thspringboota.application.store.request;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StoreCreateServiceRequest {

  private String name;
  private Double overallRating;
  private String location;
  private String phoneNumber;
  private String businessHours;
  private Set<Long> storeFoodTypeIds;

  @Builder
  private StoreCreateServiceRequest(String name, Double overallRating, String location,
      String phoneNumber, String businessHours, Set<Long> storeFoodTypeIds) {
    this.name = name;
    this.overallRating = overallRating;
    this.location = location;
    this.phoneNumber = phoneNumber;
    this.businessHours = businessHours;
    this.storeFoodTypeIds = storeFoodTypeIds;
  }
}
