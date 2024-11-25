package umc.study.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.MemberMissionConverter;
import umc.study.domain.mapping.MemberMission;
import umc.study.repository.memberMissionRepository.MemberMissionRepository;
import umc.study.service.memberMissionService.MemberMissionCommandService;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;

@RestController
@RequestMapping("/memberMissions")
@RequiredArgsConstructor
public class MemberMissionController {

    private final MemberMissionCommandService memberMissionCommandService;

    @PostMapping("/")
    public ApiResponse<ChallengeMissionResponseDTO.ChallengeMissionResultDTO> challengeMission(@Valid @RequestBody ChallengeMissionRequestDTO.ChallengeMissionDTO request) {
        MemberMission memberMission = memberMissionCommandService.challengeMission(request);
        return ApiResponse.onSuccess(MemberMissionConverter.toChallengeResponseDTO(memberMission));
    }
}