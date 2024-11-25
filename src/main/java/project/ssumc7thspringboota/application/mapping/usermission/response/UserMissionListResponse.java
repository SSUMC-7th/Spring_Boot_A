package project.ssumc7thspringboota.application.mapping.usermission.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserMissionListResponse {

  private final Long missionId;
  private final String missionDescription;
  private final String status;
  private final LocalDateTime startedAt;
  private final LocalDateTime completedAt;

  public static UserMissionListResponse from(UserMission userMission) {
    return UserMissionListResponse.builder()
                                  .missionId(userMission.getMission().getId())
                                  .missionDescription(userMission.getMission().getDescription())
                                  .status(userMission.getStatus())
                                  .startedAt(userMission.getStartedAt())
                                  .completedAt(userMission.getCompletedAt())
                                  .build();
  }
}
