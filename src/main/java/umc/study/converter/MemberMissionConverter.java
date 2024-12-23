package umc.study.converter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Review;
import umc.study.domain.enums.MissionStatus;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;
import umc.study.web.dto.MemberResponseDTO;
import umc.study.web.dto.StoreResponseDTO;

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

    public static MemberResponseDTO.MissionStatePreViewDTO missionStatePreViewDTO(MemberMission memberMission) {
        return MemberResponseDTO.MissionStatePreViewDTO.builder()
                .missionSpec(memberMission.getMission().getMissionSpec())
                .storeName(memberMission.getMission().getStore().getName())
                .reward(memberMission.getMission().getReward())
                .build();
    }
    public static MemberResponseDTO.MissionStateListDTO missionStateListDTO(Slice<MemberMission> memberMissionSlice){

        List<MemberResponseDTO.MissionStatePreViewDTO> memberMissionList = memberMissionSlice.stream()
                .map(MemberMissionConverter::missionStatePreViewDTO).collect(Collectors.toList());

        return MemberResponseDTO.MissionStateListDTO.builder()
                .isLast(memberMissionSlice.isLast())
                .isFirst(memberMissionSlice.isFirst())
                .currentPage(memberMissionSlice.getNumber())
                .totalElements(memberMissionSlice.getNumberOfElements())
                .memberMissionList(memberMissionList)
                .build();
    }
}