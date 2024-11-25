package project.ssumc7thspringboota.api.store;

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
public class StoreController {

  private final StoreService storeService;

  @PostMapping
  public ApiResponse<StoreCreateResponse> createStore(@Valid @RequestBody StoreCreateRequest storeCreateRequest) {
    StoreCreateResponse response = storeService.createStore(storeCreateRequest.toServiceRequest());
    return ApiResponse.OK(response);
  }
}
