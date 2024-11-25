package umc.spring.service;

import org.springframework.data.domain.Page;
import umc.spring.domain.mapping.user_review;

public interface StoreQueryService {
    Page<user_review> getReviewList(Long StoreId, Integer page);
}
