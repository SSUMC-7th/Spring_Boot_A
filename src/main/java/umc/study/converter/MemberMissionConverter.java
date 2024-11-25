package umc.study.converter;


import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.enums.MissionStatus;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;

public class MemberMissionConverter {
    public static MemberMission toMemberMission(ChallengeMissionRequestDTO.ChallengeMissionDTO request,
                                         Mission mission, Member member) {
        return MemberMission.builder()
                .member(member)
                .mission(mission)
                .status(MissionStatus.CHALLENGING) // Default status
                .build();
    }

    public static ChallengeMissionResponseDTO.ChallengeMissionResultDTO toChallengeResponseDTO(MemberMission memberMission) {
        return ChallengeMissionResponseDTO.ChallengeMissionResultDTO.builder()
                .memberMissionId(memberMission.getId())
                .missionId(memberMission.getMission().getId())
                .memberId(memberMission.getMember().getId())
                .status(memberMission.getStatus())
                .build();
    }
}

