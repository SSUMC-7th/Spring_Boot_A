package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.MissionConverter;
import umc.study.domain.Mission;
import umc.study.service.storeService.StoreQueryService;
import umc.study.web.dto.MissionRequestDTO;
import umc.study.web.dto.MissionResponseDTO;

@RestController
@RequestMapping("/stores")
@RequiredArgsConstructor
public class StoreController {
    private final StoreQueryService storeQueryService;

    @PostMapping("/missions")
    public ApiResponse<MissionResponseDTO.MissionResultDTO> addMission(
            @RequestBody @Valid MissionRequestDTO.MissionDTO missionDTO) {
        Mission newMission = storeQueryService.addMission(missionDTO);
        return ApiResponse.onSuccess(MissionConverter.toResultMission(newMission));
    }
}
