package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.enums.MissionCheck;
import umc.spring.domain.mapping.Quser_mission;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.mapping.user_review;
import umc.spring.domain.restaurant;
import umc.spring.domain.user;

public interface MissionRepository extends JpaRepository<mission, Long> {
    Page<mission> findAllByRestaurant(restaurant restaurant_id, PageRequest pageRequest);
}
