package project.ssumc7thspringboota.domain.store.repository;

import java.util.List;
import project.ssumc7thspringboota.domain.store.Store;

public interface StoreRepositoryCustom {

  List<Store> dynamicQueryWithBooleanBuilder(String name, Double overallRating);
}
