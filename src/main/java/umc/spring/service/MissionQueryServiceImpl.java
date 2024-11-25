package umc.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import umc.spring.domain.enums.MissionCheck;
import umc.spring.domain.mapping.Quser_mission;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.mapping.user_review;
import umc.spring.domain.restaurant;
import umc.spring.domain.user;
import umc.spring.repository.MissionRepository;
import umc.spring.repository.RestaurantRepository.RestaurantRepository;
import umc.spring.repository.UserMissionRepository;
import umc.spring.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class MissionQueryServiceImpl implements MissionQueryService{
    private final MissionRepository missionRepository;

    private final UserMissionRepository userMissionRepository;

    private final RestaurantRepository restaurantRepository;

    private final UserRepository userRepository;


    @Override
    public Page<mission> getMissionList(Long StoreId, Integer page) {
        restaurant store = restaurantRepository.findById(StoreId).get();

        Page<mission> StorePage = missionRepository.findAllByRestaurant(store, PageRequest.of(page, 10));
        return StorePage;
    }

    @Override
    public Page<user_mission> getUserMissionList(Long UserId, Integer page, MissionCheck mission_check) {
        user u  = userRepository.findById(UserId).get();

        Page<user_mission> userMissionPage = userMissionRepository.findAllByUserAndMissioncheck(u, mission_check, PageRequest.of(page, 10));
        return userMissionPage;
    }
}
