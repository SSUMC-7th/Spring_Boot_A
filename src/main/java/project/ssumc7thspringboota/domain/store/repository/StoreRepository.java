package project.ssumc7thspringboota.domain.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.store.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
