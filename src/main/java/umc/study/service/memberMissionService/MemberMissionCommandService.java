package umc.study.service.memberMissionService;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ChallengeMissionRequestDTO;

public interface MemberMissionCommandService {
    public MemberMission challengeMission
            (ChallengeMissionRequestDTO.ChallengeMissionDTO request);

    Slice<MemberMission> getMemberMissions(Long memberMissionId,Pageable pageable);
}
