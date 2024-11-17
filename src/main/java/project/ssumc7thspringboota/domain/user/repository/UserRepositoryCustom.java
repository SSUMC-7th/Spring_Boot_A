package project.ssumc7thspringboota.domain.user.repository;

import java.util.Optional;
import project.ssumc7thspringboota.domain.user.User;

public interface UserRepositoryCustom {

  Optional<User> findByEmail(String email);
}
