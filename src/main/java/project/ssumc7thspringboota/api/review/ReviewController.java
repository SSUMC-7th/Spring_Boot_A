package project.ssumc7thspringboota.api.review;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.review.request.ReviewCreateRequest;
import project.ssumc7thspringboota.application.review.ReviewService;
import project.ssumc7thspringboota.application.review.response.ReviewCreateResponse;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
@Tag(name = "리뷰 관리 기능", description = "리뷰 관리 API 입니다.")
public class ReviewController {

  private final ReviewService reviewService;

  @Operation(summary = "리뷰를 추가하는 API")
  @PostMapping
  public ApiResponse<ReviewCreateResponse> createReview(@Valid @RequestBody ReviewCreateRequest reviewCreateRequest) {
    ReviewCreateResponse response = reviewService.createReview(reviewCreateRequest.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
