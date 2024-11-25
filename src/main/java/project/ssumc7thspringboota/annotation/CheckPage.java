package project.ssumc7thspringboota.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import project.ssumc7thspringboota.annotation.implement.PageValidator;

@Constraint(validatedBy = PageValidator.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPage {
  String message() default "페이지 번호는 1 이상의 값이어야 합니다.";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
