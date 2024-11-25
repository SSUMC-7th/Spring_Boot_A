package project.ssumc7thspringboota.common.annotation.implement;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import project.ssumc7thspringboota.common.annotation.CheckPage;
import project.ssumc7thspringboota.common.exception.BusinessException;
import project.ssumc7thspringboota.common.exception.ErrorCode;

public class PageValidator implements ConstraintValidator<CheckPage, Integer> {

  @Override
  public boolean isValid(Integer value, ConstraintValidatorContext context) {
    if (value == null || value < 1) {
      throw new BusinessException(ErrorCode.INVALID_PAGE);
    }
    return true;
  }

  /**
   * page 값을 0 기반으로 변환
   * @param value 1 이상의 페이지 값
   * @return 0 기반의 페이지 값
   */
  public static int adjustPage(int value) {
    return value - 1;
  }
}
