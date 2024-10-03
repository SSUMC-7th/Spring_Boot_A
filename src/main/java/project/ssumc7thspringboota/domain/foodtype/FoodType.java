package project.ssumc7thspringboota.domain.foodtype;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.domain.BaseEntity;
import project.ssumc7thspringboota.domain.storefoodtype.StoreFoodType;
import project.ssumc7thspringboota.domain.userpreferredfoodtype.UserPreferredFoodType;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FoodType extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long foodTypeId;

  private String name;

  @OneToMany(mappedBy = "foodType", fetch = FetchType.LAZY)
  private Set<UserPreferredFoodType> userPreferredFoodTypes;

  @OneToMany(mappedBy = "foodType", fetch = FetchType.LAZY)
  private Set<StoreFoodType> storeFoodTypes;
}
