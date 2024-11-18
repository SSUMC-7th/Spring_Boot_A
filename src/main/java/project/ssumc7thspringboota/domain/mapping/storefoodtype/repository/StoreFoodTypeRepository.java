package project.ssumc7thspringboota.domain.mapping.storefoodtype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType;

@Repository
public interface StoreFoodTypeRepository extends JpaRepository<StoreFoodType, Long> {
}
