package project.ssumc7thspringboota.domain.store;

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
import project.ssumc7thspringboota.domain.mission.Mission;
import project.ssumc7thspringboota.domain.review.Review;
import project.ssumc7thspringboota.domain.storefoodtype.StoreFoodType;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Store extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long storeId;

  private String name;

  private Double overallRating;

  private String location;

  private String phoneNumber;

  private String businessHours;

  @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
  private Set<StoreFoodType> storeFoodTypes;

  @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
  private Set<Review> reviews;

  @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
  private Set<Mission> missions;
}
