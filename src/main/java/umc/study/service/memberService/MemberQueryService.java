package umc.study.service.memberService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import umc.study.domain.Review;

public interface MemberQueryService {
    Page<Review> getReviewList(Long memberId, Integer page);
}
