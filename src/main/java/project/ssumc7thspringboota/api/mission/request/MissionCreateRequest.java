package project.ssumc7thspringboota.api.mission.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import project.ssumc7thspringboota.application.mission.request.MissionCreateServiceRequest;

@Getter
public class MissionCreateRequest {

  @NotNull(message = "가게 ID를 입력해주세요.")
  private Long storeId;

  @NotNull(message = "보상 포인트를 입력해주세요.")
  private Integer rewardPoints;

  @NotBlank(message = "미션 설명을 입력해주세요.")
  private String description;

  public MissionCreateServiceRequest toServiceRequest() {
    return MissionCreateServiceRequest.builder()
                                      .storeId(storeId)
                                      .rewardPoints(rewardPoints)
                                      .description(description)
                                      .build();
  }
}
