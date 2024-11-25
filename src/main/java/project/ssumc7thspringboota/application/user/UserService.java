package project.ssumc7thspringboota.application.user;

import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.user.implement.UserValidator;
import project.ssumc7thspringboota.application.user.request.UserJoinServiceRequest;
import project.ssumc7thspringboota.application.user.response.UserJoinResponse;
import project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType;
import project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.repository.UserPreferredFoodTypeRepository;
import project.ssumc7thspringboota.domain.user.User;
import project.ssumc7thspringboota.domain.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserPreferredFoodTypeRepository userPreferredFoodTypeRepository;
  private final UserValidator userValidator;

  @Transactional
  public UserJoinResponse joinUser(UserJoinServiceRequest request) {
    userValidator.checkDuplicateEmail(request.getEmail());

    Set<UserPreferredFoodType> preferredFoodTypes = request.getPreferredFoodTypeIds().stream()
                                                           .map(userPreferredFoodTypeRepository::findById)
                                                           .filter(Optional::isPresent)
                                                           .map(Optional::get)
                                                           .collect(Collectors.toSet());

    User user = User.builder()
                    .email(request.getEmail())
                    .name(request.getName())
                    .dateOfBirth(request.getDateOfBirth())
                    .address(request.getAddress())
                    .phoneNumber(request.getPhoneNumber())
                    .gender(request.getGender())
                    .points(request.getPoints())
                    .preferredFoodTypes(preferredFoodTypes)
                    .build();

    User savedUser = userRepository.save(user);

    return UserJoinResponse.from(savedUser);
  }
}
