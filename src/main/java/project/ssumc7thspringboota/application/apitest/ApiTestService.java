package project.ssumc7thspringboota.application.apitest;

import org.springframework.stereotype.Service;
import project.ssumc7thspringboota.application.apitest.response.ApiTestResponse;

@Service
public class ApiTestService {

  public ApiTestResponse getApiTestResponse() {
    return ApiTestResponse.from("API 응답 테스트 입니다.");
  }
}
