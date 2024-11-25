package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.converter.ReviewConverter;
import umc.study.domain.Review;
import umc.study.repository.reviewRepository.ReviewRepository;
import umc.study.repository.storeRepository.StoreRepository;
import umc.study.service.storeService.StoreQueryService;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreController {

    private final StoreQueryService storeQueryService;

    @PostMapping("/reviews")
    public ApiResponse<ReviewResponseDTO.ReviewDTO> addReview(@RequestBody @Valid ReviewRequestDTO.CreateReviewDTO review) {
        Review newReview = storeQueryService.addReview(review);
        return ApiResponse.onSuccess(ReviewConverter.toReviewResultDTO(newReview));
    }
}
