package umc.spring.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.enums.Role;

import java.time.LocalDate;
import java.util.List;

public class UserRequestDTO {
    @Getter
    @Setter   // thymeleaf에서 사용하기 위해 추가
    public static class JoinDto {
        @NotBlank
        String name;
        @NotBlank
        @Email
        String email;    // 이메일 필드 추가
        @NotBlank
        String password;    // 비밀번호 필드 추가
        @NotNull
        Gender gender;
        @NotNull
        LocalDate birth;
        @Size(min = 5, max = 12)
        String address;
        @NotNull
        Role role;    // 역할 필드 추가
    }
}
