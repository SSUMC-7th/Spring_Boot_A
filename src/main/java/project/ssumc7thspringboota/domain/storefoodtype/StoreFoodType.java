package project.ssumc7thspringboota.domain.storefoodtype;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.domain.BaseEntity;
import project.ssumc7thspringboota.domain.foodtype.FoodType;
import project.ssumc7thspringboota.domain.store.Store;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class StoreFoodType extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long storeFoodTypeId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "store_id")
  private Store store;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "food_type_id")
  private FoodType foodType;
}
