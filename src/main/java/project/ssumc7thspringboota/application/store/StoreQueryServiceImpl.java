package project.ssumc7thspringboota.application.store;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.domain.store.Store;
import project.ssumc7thspringboota.domain.store.repository.StoreRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService{

  private final StoreRepository storeRepository;

  @Override
  public Optional<Store> findStore(Long id) {
    return storeRepository.findById(id);
  }

  @Override
  public List<Store> findStoresByNameAndRating(String name, Double overallRating) {
    List<Store> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(name, overallRating);

    filteredStores.forEach(store -> System.out.println("Store: " + store));

    return filteredStores;
  }
}
