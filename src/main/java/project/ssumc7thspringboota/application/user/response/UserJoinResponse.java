package project.ssumc7thspringboota.application.user.response;

import lombok.Builder;
import lombok.Getter;
import project.ssumc7thspringboota.domain.user.User;

@Getter
@Builder
public class UserJoinResponse {

  private final String email;
  private final String username;

  public static UserJoinResponse from(User user) {
    return UserJoinResponse.builder()
                           .email(user.getEmail())
                           .username(user.getName())
                           .build();
  }
}
