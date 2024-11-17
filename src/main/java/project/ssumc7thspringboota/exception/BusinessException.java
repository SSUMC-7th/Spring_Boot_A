package project.ssumc7thspringboota.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

  private final int code;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.code = errorCode.getStatus().value();
  }
}
