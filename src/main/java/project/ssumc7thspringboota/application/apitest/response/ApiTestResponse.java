package project.ssumc7thspringboota.application.apitest.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiTestResponse {

  private final String testData;

  public static ApiTestResponse from(String testData) {
    return ApiTestResponse.builder()
                          .testData(testData)
                          .build();
  }
}
