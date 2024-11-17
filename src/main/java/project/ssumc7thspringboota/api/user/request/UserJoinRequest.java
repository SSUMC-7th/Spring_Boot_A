package project.ssumc7thspringboota.api.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import project.ssumc7thspringboota.application.user.request.UserJoinServiceRequest;

@Getter
@NoArgsConstructor
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

  @Builder
  private UserJoinRequest(String email, String password, String username, LocalDate dateOfBirth,
      String address, String phoneNumber, String gender, Integer points, Set<Long> preferredFoodTypeIds) {
    this.email = email;
    this.password = password;
    this.username = username;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.points = points;
    this.preferredFoodTypeIds = preferredFoodTypeIds;
  }

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
