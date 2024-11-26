package project.ssumc7thspringboota.api.mission;

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
import project.ssumc7thspringboota.common.annotation.CheckPage;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.mission.request.MissionCreateRequest;
import project.ssumc7thspringboota.application.mission.MissionService;
import project.ssumc7thspringboota.application.mission.response.MissionCreateResponse;
import project.ssumc7thspringboota.application.mission.response.MissionListResponse;
import project.ssumc7thspringboota.common.annotation.implement.PageValidator;

@RestController
@RequestMapping("/missions")
@RequiredArgsConstructor
@Tag(name = "미션 관리 기능", description = "미션 관리 API 입니다.")
public class MissionController {

  private final MissionService missionService;

  @Operation(summary = "미션을 추가하는 API")
  @PostMapping
  public ApiResponse<MissionCreateResponse> createMission(@Valid @RequestBody MissionCreateRequest request) {
    MissionCreateResponse response = missionService.createMission(request.toServiceRequest());
    return ApiResponse.OK(response);
  }

  @Operation(summary = "특정 가게의 미션 목록 조회 API (페이징 지원)")
  @GetMapping("/store")
  public ApiResponse<Page<MissionListResponse>> getMissionsByStore(
      @RequestParam Long storeId,
      @CheckPage @RequestParam Integer page) {

    int zeroBasedPage = PageValidator.adjustPage(page);
    PageRequest pageRequest = PageRequest.of(zeroBasedPage, 10);

    Page<MissionListResponse> missions = missionService.getMissionsByStore(storeId, pageRequest);
    return ApiResponse.OK(missions);
  }
}
