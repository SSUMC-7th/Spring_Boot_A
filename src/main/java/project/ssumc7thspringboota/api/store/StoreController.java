package project.ssumc7thspringboota.api.store;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.store.request.StoreCreateRequest;
import project.ssumc7thspringboota.application.store.StoreService;
import project.ssumc7thspringboota.application.store.response.StoreCreateResponse;

@RestController
@RequestMapping("/stores")
@RequiredArgsConstructor
@Tag(name = "가게 관리 기능", description = "가게 관리 API 입니다.")
public class StoreController {

  private final StoreService storeService;

  @Operation(summary = "가게를 추가하는 기능 구현")
  @PostMapping
  public ApiResponse<StoreCreateResponse> createStore(@Valid @RequestBody StoreCreateRequest storeCreateRequest) {
    StoreCreateResponse response = storeService.createStore(storeCreateRequest.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
