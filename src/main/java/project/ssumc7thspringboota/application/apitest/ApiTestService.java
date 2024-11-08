package project.ssumc7thspringboota.application.apitest;

import org.springframework.stereotype.Service;
import project.ssumc7thspringboota.application.apitest.request.ApiExceptionTestServiceRequest;
import project.ssumc7thspringboota.application.apitest.response.ApiTestResponse;
import project.ssumc7thspringboota.exception.BusinessException;
import project.ssumc7thspringboota.exception.ErrorCode;

@Service
public class ApiTestService {

  public ApiTestResponse getApiTestResponse() {
    return ApiTestResponse.from("API 응답 테스트 입니다.");
  }

//  public ApiTestResponse checkFlag(ApiExceptionTestServiceRequest apiExceptionTestServiceRequest) {
//    Integer flag = apiExceptionTestServiceRequest.getFlag();
//
//    if (flag == 1) {
//      throw new BusinessException(ErrorCode.USER_NOT_FOUND);
//    }
//
//    return ApiTestResponse.from("API Exception 응답 테스트입니다." + "flag: " + flag);
//  }

  public ApiTestResponse checkFlag(Integer flag) {
    if (flag == 1) {
      throw new BusinessException(ErrorCode.INVALID_FLAG);
    }

    return ApiTestResponse.from("API Exception 응답 테스트입니다." + "flag: " + flag);
  }
}
