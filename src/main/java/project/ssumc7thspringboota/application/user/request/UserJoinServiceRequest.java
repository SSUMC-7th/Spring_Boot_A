package project.ssumc7thspringboota.application.user.request;

import java.time.LocalDate;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserJoinServiceRequest {

  private String email;
  private String password;
  private String name;
  private LocalDate dateOfBirth;
  private String address;
  private String phoneNumber;
  private String gender;
  private Integer points;
  private Set<Long> preferredFoodTypeIds;

  @Builder
  public UserJoinServiceRequest(String email, String password, String name, LocalDate dateOfBirth,
      String address, String phoneNumber, String gender, Integer points, Set<Long> preferredFoodTypeIds) {
    this.email = email;
    this.password = password;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.points = points;
    this.preferredFoodTypeIds = preferredFoodTypeIds;
  }
}

