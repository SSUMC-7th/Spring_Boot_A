package project.ssumc7thspringboota.api.mapping.usermission;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.mapping.usermission.request.UserMissionCreateRequest;
import project.ssumc7thspringboota.application.mapping.usermission.UserMissionService;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionCreateResponse;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionListResponse;
import project.ssumc7thspringboota.common.annotation.CheckPage;
import project.ssumc7thspringboota.common.annotation.implement.PageValidator;

@RestController
@RequestMapping("/usermissions")
@RequiredArgsConstructor
@Tag(name = "유저의 미션을 관리하는 기능", description = "유저 미션 관리 API 입니다.")
public class UserMissionController {

  private final UserMissionService userMissionService;

  @Operation(summary = "도전 중인 미션에 추가하는 API")
  @PostMapping
  public ApiResponse<UserMissionCreateResponse> createUserMission(@Valid @RequestBody UserMissionCreateRequest request) {
    UserMissionCreateResponse response = userMissionService.createUserMission(request.toServiceRequest());
    return ApiResponse.OK(response);
  }

  @Operation(summary = "유저가 진행 중인 미션 조회 API")
  @GetMapping("/in-progress")
  public ApiResponse<Page<UserMissionListResponse>> getUserInProgressMissions(
      @RequestParam Long userId,
      @CheckPage @RequestParam Integer page,
      @RequestParam Integer size) {

    int zeroBasedPage = PageValidator.adjustPage(page);
    PageRequest pageRequest = PageRequest.of(zeroBasedPage, size);

    Page<UserMissionListResponse> userMissions = userMissionService.getUserInProgressMissions(userId, pageRequest);
    return ApiResponse.OK(userMissions);
  }
}
