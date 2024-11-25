package umc.spring.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.enums.MissionCheck;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_mission;
import umc.spring.service.MissionQueryService;
import umc.spring.validation.annotation.ExistRestaurant;
import umc.spring.web.dto.StoreResponseDTO;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/missions")
public class MissionRestController {
    private final MissionQueryService missionQueryService;

    @GetMapping("/{userId}/")
    @Operation(summary = "특정 유저의 진행중 미션 목록 조회 API",description = "특정 유저가 진행중인 미션 목록을 조회하는 API이며, 페이징을 포함합니다. query String 으로 page 번호를 주세요")
    @ApiResponses({
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "COMMON200",description = "OK, 성공"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "AUTH003", description = "access 토큰을 주세요!",content = @Content(schema = @Schema(implementation = ApiResponse.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "AUTH004", description = "acess 토큰 만료",content = @Content(schema = @Schema(implementation = ApiResponse.class))),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "AUTH006", description = "acess 토큰 모양이 이상함",content = @Content(schema = @Schema(implementation = ApiResponse.class))),
    })
    @Parameters({
            @Parameter(name = "userId", description = "가게의 아이디, path variable 입니다!")
    })
    public ApiResponse<StoreResponseDTO.UserMissionPreViewListDTO> getUserMissionList(@ExistRestaurant @PathVariable(name = "userId") Long userId, @RequestParam(name = "page") Integer page, @RequestParam(name = "missioncheck") MissionCheck missionCheck){
        Page<user_mission> usermissionList = missionQueryService.getUserMissionList(userId, page, missionCheck);
        return ApiResponse.onSuccess(StoreConverter.usermissionPreViewListDTO(usermissionList));
    }
}
