package project.ssumc7thspringboota.application.mapping.usermission.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;

import java.time.LocalDateTime;

@Getter
@Builder
public class UserMissionCompleteResponse {

  private final Long id;
  private final String status;
  private final LocalDateTime completedAt;

  public static UserMissionCompleteResponse from(UserMission userMission) {
    return UserMissionCompleteResponse.builder()
                                      .id(userMission.getId())
                                      .status(userMission.getStatus())
                                      .completedAt(userMission.getCompletedAt())
                                      .build();
  }
}
