package project.ssumc7thspringboota.api.mapping.usermission.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import project.ssumc7thspringboota.application.mapping.usermission.request.UserMissionCreateServiceRequest;

@Getter
public class UserMissionCreateRequest {

  @NotNull(message = "유저 ID를 입력해주세요.")
  private Long userId;

  @NotNull(message = "미션 ID를 입력해주세요.")
  private Long missionId;

  public UserMissionCreateServiceRequest toServiceRequest() {
    return UserMissionCreateServiceRequest.builder()
                                          .userId(userId)
                                          .missionId(missionId)
                                          .build();
  }
}
