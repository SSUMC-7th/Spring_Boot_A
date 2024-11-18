package project.ssumc7thspringboota.application.mission.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MissionCreateServiceRequest {

  private Long storeId;
  private Integer rewardPoints;
  private String description;

  @Builder
  private MissionCreateServiceRequest(Long storeId, Integer rewardPoints, String description) {
    this.storeId = storeId;
    this.rewardPoints = rewardPoints;
    this.description = description;
  }
}
