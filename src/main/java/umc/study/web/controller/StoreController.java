package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.repository.reviewRepository.ReviewRepository;
import umc.study.repository.storeRepository.StoreRepository;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreController {

    private final StoreRepository storeRepository;
    private final ReviewRepository reviewRepository;

    @PostMapping("{storeId}/reviews")
    public ApiResponse<ReviewResponseDTO.ReviewDTO> addReview(@RequestParam(value = "storeId") Long storeId
            , @RequestBody @Valid ReviewRequestDTO.CreateReviewDTO review) {
        return null;
    }
}
