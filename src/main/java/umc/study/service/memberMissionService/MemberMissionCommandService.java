package umc.study.service.memberMissionService;

import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ChallengeMissionRequestDTO;
import umc.study.web.dto.ChallengeMissionResponseDTO;

public interface MemberMissionCommandService {
    public MemberMission challengeMission
            (ChallengeMissionRequestDTO.ChallengeMissionDTO request);
}
