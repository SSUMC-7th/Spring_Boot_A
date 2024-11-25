package project.ssumc7thspringboota.application.user.request;

import java.time.LocalDate;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserJoinServiceRequest {

  private final String email;
  private final String password;
  private final String name;
  private final LocalDate dateOfBirth;
  private final String address;
  private final String phoneNumber;
  private final String gender;
  private final Integer points;
  private final Set<Long> preferredFoodTypeIds;
}

