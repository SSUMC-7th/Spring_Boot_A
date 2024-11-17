package project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType;

@Repository
public interface UserPreferredFoodTypeRepository extends JpaRepository<UserPreferredFoodType, Long> {
}
