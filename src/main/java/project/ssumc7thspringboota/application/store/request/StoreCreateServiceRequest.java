package project.ssumc7thspringboota.application.store.request;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreCreateServiceRequest {

  private final String name;
  private final Double overallRating;
  private final String location;
  private final String phoneNumber;
  private final String businessHours;
  private final Set<Long> storeFoodTypeIds;
}
