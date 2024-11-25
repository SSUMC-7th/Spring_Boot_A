package project.ssumc7thspringboota.api.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ssumc7thspringboota.api.ApiResponse;
import project.ssumc7thspringboota.api.user.request.UserJoinRequest;
import project.ssumc7thspringboota.application.user.UserService;
import project.ssumc7thspringboota.application.user.response.UserJoinResponse;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/join")
  public ApiResponse<UserJoinResponse> join(@Valid @RequestBody UserJoinRequest userJoinRequest) {
    UserJoinResponse userJoinResponse = userService.joinUser(userJoinRequest.toServiceRequest());
    return ApiResponse.OK(userJoinResponse);
  }
}
