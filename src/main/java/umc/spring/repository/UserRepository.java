package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.mapping.user_review;
import umc.spring.domain.user;

public interface UserRepository extends JpaRepository<user, Long> {
}
