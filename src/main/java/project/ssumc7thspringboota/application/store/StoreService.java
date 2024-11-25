package project.ssumc7thspringboota.application.store;

import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.store.request.StoreCreateServiceRequest;
import project.ssumc7thspringboota.application.store.response.StoreCreateResponse;
import project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType;
import project.ssumc7thspringboota.domain.mapping.storefoodtype.repository.StoreFoodTypeRepository;
import project.ssumc7thspringboota.domain.store.Store;
import project.ssumc7thspringboota.domain.store.repository.StoreRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StoreService {

  private final StoreRepository storeRepository;
  private final StoreFoodTypeRepository storeFoodTypeRepository;

  @Transactional
  public StoreCreateResponse createStore(StoreCreateServiceRequest request) {
    Set<StoreFoodType> storeFoodTypes = request.getStoreFoodTypeIds().stream()
                                               .map(storeFoodTypeRepository::findById)
                                               .filter(Optional::isPresent)
                                               .map(Optional::get)
                                               .collect(Collectors.toSet());

    Store store = Store.builder()
                       .name(request.getName())
                       .overallRating(request.getOverallRating())
                       .location(request.getLocation())
                       .phoneNumber(request.getPhoneNumber())
                       .businessHours(request.getBusinessHours())
                       .storeFoodTypes(storeFoodTypes)
                       .build();

    Store savedStore = storeRepository.save(store);

    return StoreCreateResponse.from(savedStore);
  }
}
