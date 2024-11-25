package umc.study.service.memberService;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import umc.study.domain.Review;
import umc.study.repository.reviewRepository.ReviewRepository;

@Service
@RequiredArgsConstructor
public class MemberQueryServiceImpl implements MemberQueryService {
    private final ReviewRepository reviewRepository;

    @Override
    public Page<Review> getReviewList(Long memberId, PageRequest pageRequest) {
        return null;
    }
}
