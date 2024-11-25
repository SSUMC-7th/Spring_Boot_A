package umc.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import umc.spring.domain.Qrestaurant;
import umc.spring.domain.mapping.Quser_review;
import umc.spring.domain.mapping.user_review;
import umc.spring.domain.restaurant;
import umc.spring.repository.RestaurantRepository.RestaurantRepository;
import umc.spring.repository.ReviewRepository;

@Service
@RequiredArgsConstructor
public class StoreQueryServiceImpl implements StoreQueryService{
    private final RestaurantRepository storeRepository;

    private final ReviewRepository reviewRepository;

    @Override
    public Page<user_review> getReviewList(Long StoreId, Integer page) {
        restaurant store = storeRepository.findById(StoreId).get();

        Page<user_review> StorePage = reviewRepository.findAllByRestaurant(store, PageRequest.of(page, 10));
        return StorePage;
    }
}
