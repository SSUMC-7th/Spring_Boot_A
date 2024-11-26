package project.ssumc7thspringboota.application.mission.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.mission.Mission;

@Getter
@Builder
public class MissionListResponse {

  private final Long id;
  private final String description;
  private final Integer rewardPoints;

  public static MissionListResponse from(Mission mission) {
    return MissionListResponse.builder()
                              .id(mission.getId())
                              .description(mission.getDescription())
                              .rewardPoints(mission.getRewardPoints())
                              .build();
  }
}
