package project.ssumc7thspringboota.application.mission.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.mission.Mission;

@Getter
@Builder
public class MissionCreateResponse {

  private final Long id;
  private final Long storeId;
  private final Integer rewardPoints;
  private final String description;

  public static MissionCreateResponse from(Mission mission) {
    return MissionCreateResponse.builder()
                                .id(mission.getId())
                                .storeId(mission.getStore().getId())
                                .rewardPoints(mission.getRewardPoints())
                                .description(mission.getDescription())
                                .build();
  }
}
