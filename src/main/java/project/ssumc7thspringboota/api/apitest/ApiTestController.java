package project.ssumc7thspringboota.api.apitest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.apitest.request.ApiExceptionTestRequest;
import project.ssumc7thspringboota.application.apitest.ApiTestService;
import project.ssumc7thspringboota.application.apitest.response.ApiTestResponse;

@RestController
@RequestMapping("/apitest")
@RequiredArgsConstructor
public class ApiTestController {

  private final ApiTestService apiTestService;

  @GetMapping
  public ApiResponse<ApiTestResponse> getApiTestResponse() {
    return ApiResponse.success(apiTestService.getApiTestResponse());
  }

//  @GetMapping("/exception")
//  public ApiResponse<ApiTestResponse> getApiExceptionResponse(@Valid @RequestBody
//      ApiExceptionTestRequest apiExceptionTestRequest) {
//    return ApiResponse.success(apiTestService.checkFlag(apiExceptionTestRequest.toApiTestServiceRequest()));
//  }

  @GetMapping("/exception")
  public ApiResponse<ApiTestResponse> getApiExceptionResponse(@RequestParam Integer flag) {
    return ApiResponse.success(apiTestService.checkFlag(flag));
  }
}
