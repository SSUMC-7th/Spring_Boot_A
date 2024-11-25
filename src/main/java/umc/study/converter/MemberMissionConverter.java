package umc.study.converter;

import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.enums.MissionStatus;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

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
  
    public static List<MemberMission> toMemberMission(List<Member> memberList) {
        return memberList.stream().map(member ->
                MemberMission.builder().member(member).build()
        ).collect(Collectors.toList());
    }
}