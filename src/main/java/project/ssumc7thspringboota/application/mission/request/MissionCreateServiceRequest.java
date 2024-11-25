package project.ssumc7thspringboota.application.mission.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MissionCreateServiceRequest {

  private final Long storeId;
  private final Integer rewardPoints;
  private final String description;
}
