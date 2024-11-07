package umc.study.repository.storeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.study.domain.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> , StoreRepositoryCustom {
}
