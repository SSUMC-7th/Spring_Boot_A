package project.ssumc7thspringboota.application.apitest.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiExceptionTestServiceRequest {

  private final Integer flag;
}
