package umc.spring.service;

import org.springframework.data.domain.Page;
import umc.spring.domain.enums.MissionCheck;
import umc.spring.domain.mapping.Quser_mission;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.mapping.user_review;

public interface MissionQueryService {
    Page<mission> getMissionList(Long StoreId, Integer page);

    Page<user_mission> getUserMissionList(Long UserId, Integer page, MissionCheck mission_check);
}
