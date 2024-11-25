package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.enums.MissionCheck;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.user;

public interface UserMissionRepository extends JpaRepository<user_mission, Long> {
    Page<user_mission> findAllByUserAndMissioncheck(user user_id, MissionCheck missionCheck, PageRequest pageRequest);
}
