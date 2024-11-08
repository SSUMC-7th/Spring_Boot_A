package project.ssumc7thspringboota.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
  USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
  INVALID_FLAG(HttpStatus.BAD_REQUEST, "flag는 1일 수 없습니다.");

  private final HttpStatus status;
  private final String message;
}
