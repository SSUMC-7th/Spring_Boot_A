package project.ssumc7thspringboota.api.apitest.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import project.ssumc7thspringboota.application.apitest.request.ApiExceptionTestServiceRequest;

@Getter
public class ApiExceptionTestRequest {

  @NotBlank(message = "flag는 필수 입력 값입니다.")
  private Integer flag;

  public ApiExceptionTestServiceRequest toApiTestServiceRequest() {
    return ApiExceptionTestServiceRequest.builder()
                                         .flag(flag)
                                         .build();
  }
}
