package project.ssumc7thspringboota.api.mapping.usermission;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.mapping.usermission.request.UserMissionCreateRequest;
import project.ssumc7thspringboota.application.mapping.usermission.UserMissionService;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionCreateResponse;

@RestController
@RequestMapping("/usermissions")
@RequiredArgsConstructor
public class UserMissionController {

  private final UserMissionService userMissionService;

  @PostMapping
  public ApiResponse<UserMissionCreateResponse> createUserMission(@Valid @RequestBody UserMissionCreateRequest request) {
    UserMissionCreateResponse response = userMissionService.createUserMission(request.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
