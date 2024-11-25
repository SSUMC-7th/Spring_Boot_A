package umc.study.service.memberMissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.converter.MemberMissionConverter;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.mapping.MemberMission;
import umc.study.repository.memberMissionRepository.MemberMissionRepository;
import umc.study.repository.memberRepository.MemberRepository;
import umc.study.repository.missionRepository.MissionRepository;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;

@Service
@RequiredArgsConstructor
public class MemberMissionCommandServiceImpl implements MemberMissionCommandService {
    private final MemberMissionRepository memberMissionRepository;
    private final MissionRepository missionRepository;
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public MemberMission challengeMission
            (ChallengeMissionRequestDTO.ChallengeMissionDTO request) {

        Mission mission = missionRepository.findById(request.getMissionId())
                .orElseThrow(() -> new RuntimeException("Mission not found"));

        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new RuntimeException("Member not found"));

        // Convert DTO to Entity
        MemberMission memberMission = MemberMissionConverter.toMemberMission(request,mission,member);

        // Save MemberMission
        memberMissionRepository.save(memberMission);

        // Convert Entity to Response DTO
        return memberMission;
    }
}
