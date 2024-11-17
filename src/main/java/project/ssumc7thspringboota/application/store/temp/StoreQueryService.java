package project.ssumc7thspringboota.application.store.temp;

import java.util.List;
import java.util.Optional;
import project.ssumc7thspringboota.domain.store.Store;

public interface StoreQueryService {

  Optional<Store> findStore(Long id);
  List<Store> findStoresByNameAndRating(String name, Double overallRating);
}
