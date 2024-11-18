package project.ssumc7thspringboota.api.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Set;
import java.time.LocalDate;
import lombok.Getter;
import project.ssumc7thspringboota.application.user.request.UserJoinServiceRequest;

@Getter
public class UserJoinRequest {

  @NotBlank(message = "이메일을 입력해주세요.")
  private String email;

  @NotBlank(message = "비밀번호를 입력해주세요.")
  private String password;

  @NotBlank(message = "이름을 입력해주세요.")
  private String username;

  @NotNull(message = "생년월일을 입력해주세요.")
  private LocalDate dateOfBirth;

  @NotBlank(message = "주소를 입력해주세요.")
  private String address;

  @NotBlank(message = "전화번호를 입력해주세요.")
  @Pattern(regexp = "^[0-9]{10,11}$", message = "유효한 전화번호를 입력해주세요.")
  private String phoneNumber;

  @NotBlank(message = "성별을 입력해주세요.")
  private String gender;

  private Integer points;

  private Set<Long> preferredFoodTypeIds;

  public UserJoinServiceRequest toServiceRequest() {
    return UserJoinServiceRequest.builder()
                                 .email(email)
                                 .password(password)
                                 .name(username)
                                 .dateOfBirth(dateOfBirth)
                                 .address(address)
                                 .phoneNumber(phoneNumber)
                                 .gender(gender)
                                 .points(points != null ? points : 0)
                                 .preferredFoodTypeIds(preferredFoodTypeIds)
                                 .build();
  }
}
