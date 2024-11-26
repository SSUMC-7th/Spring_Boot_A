package project.ssumc7thspringboota.api.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "유저 관리 기능", description = "유저 관리 API 입니다.")
public class UserController {

  private final UserService userService;

  @Operation(summary = "유저를 생성하는 API")
  @PostMapping("/join")
  public ApiResponse<UserJoinResponse> join(@Valid @RequestBody UserJoinRequest userJoinRequest) {
    UserJoinResponse userJoinResponse = userService.joinUser(userJoinRequest.toServiceRequest());
    return ApiResponse.OK(userJoinResponse);
  }
}
