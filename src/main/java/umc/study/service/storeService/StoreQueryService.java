package umc.study.service.storeService;

import org.springframework.data.domain.Page;
import umc.study.domain.Mission;
import umc.study.domain.Store;
import umc.study.web.dto.MissionRequestDTO;
import umc.study.domain.Review;
import umc.study.web.dto.ReviewRequestDTO;

import java.util.List;
import java.util.Optional;

public interface StoreQueryService {
    Optional<Store> findStore(Long id);
    List<Store> findStoresByNameAndScore(String name, Float score);
    Mission addMission(MissionRequestDTO.MissionDTO request);
    Review addReview(ReviewRequestDTO.CreateReviewDTO requestDTO);
    Page<Review> getReviewList(Long storeId, Integer page);
    Page<Mission> getMissionList(Long storeId, Integer page);
}
