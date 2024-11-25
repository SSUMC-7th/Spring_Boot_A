package project.ssumc7thspringboota.application.mapping.usermission.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;

@Getter
@Builder
public class UserMissionCreateResponse {

  private final Long id;
  private final Long userId;
  private final Long missionId;
  private final String status;

  public static UserMissionCreateResponse from(UserMission userMission) {
    return UserMissionCreateResponse.builder()
                                    .id(userMission.getId())
                                    .userId(userMission.getUser().getId())
                                    .missionId(userMission.getMission().getId())
                                    .status(userMission.getStatus())
                                    .build();
  }
}
