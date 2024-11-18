package project.ssumc7thspringboota.api.review;

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
public class ReviewController {

  private final ReviewService reviewService;

  @PostMapping
  public ApiResponse<ReviewCreateResponse> createReview(@Valid @RequestBody ReviewCreateRequest reviewCreateRequest) {
    ReviewCreateResponse response = reviewService.createReview(reviewCreateRequest.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
