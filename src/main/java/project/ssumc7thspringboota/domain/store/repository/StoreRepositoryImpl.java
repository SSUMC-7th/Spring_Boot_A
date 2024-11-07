package project.ssumc7thspringboota.domain.store.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.store.QStore;
import project.ssumc7thspringboota.domain.store.Store;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepositoryCustom {

  private final JPAQueryFactory jpaQueryFactory;
  private final QStore store = QStore.store;

  @Override
  public List<Store> dynamicQueryWithBooleanBuilder(String name, Double overallRating) {
    BooleanBuilder predicate = new BooleanBuilder();

    if (name != null) {
      predicate.and(store.name.eq(name));
    }

    if (overallRating != null) {
      predicate.and(store.overallRating.goe(overallRating));
    }

    return jpaQueryFactory
        .selectFrom(store)
        .where(predicate)
        .fetch();
  }
}
