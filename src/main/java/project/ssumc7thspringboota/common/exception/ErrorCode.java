package project.ssumc7thspringboota.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
  USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
  STORE_NOT_FOUND(HttpStatus.NOT_FOUND, "가게를 찾을 수 없습니다."),
  DUPLICATE_EMAIL(HttpStatus.BAD_REQUEST, "중복된 이메일입니다."),
  MISSION_NOT_FOUND(HttpStatus.NOT_FOUND, "미션을 찾을 수 없습니다."),
  REVIEW_NOT_FOUND(HttpStatus.NOT_FOUND, "리뷰를 찾을 수 없습니다."),
  INVALID_PAGE(HttpStatus.BAD_REQUEST, "페이지 번호는 1 이상의 값이어야 합니다.");

  private final HttpStatus status;
  private final String message;
}
