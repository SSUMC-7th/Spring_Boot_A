package umc.study.converter;

import umc.study.domain.Mission;
import umc.study.domain.Store;
import umc.study.web.dto.MissionRequestDTO;
import umc.study.web.dto.MissionResponseDTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class MissionConverter {
    public static MissionResponseDTO.MissionResultDTO toResultMission(Mission mission) {
        return MissionResponseDTO.MissionResultDTO.builder()
                .missionId(mission.getId())
                .createdAt(LocalDate.now())
                .build();
    }

    public static Mission toMission(MissionRequestDTO.MissionDTO missionDTO, Store store) {
        return Mission.builder()
                .store(store)
                .missionSpec(missionDTO.getMissionSpec())
                .reward(missionDTO.getReward())
                .deadline(missionDTO.getDeadline())
                .memberMissionList(new ArrayList<>())
                .build();
    }
}
