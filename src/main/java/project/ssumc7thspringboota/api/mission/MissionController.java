package project.ssumc7thspringboota.api.mission;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.mission.request.MissionCreateRequest;
import project.ssumc7thspringboota.application.mission.MissionService;
import project.ssumc7thspringboota.application.mission.response.MissionCreateResponse;

@RestController
@RequestMapping("/missions")
@RequiredArgsConstructor
public class MissionController {

  private final MissionService missionService;

  @PostMapping
  public ApiResponse<MissionCreateResponse> createMission(@Valid @RequestBody MissionCreateRequest request) {
    MissionCreateResponse response = missionService.createMission(request.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
