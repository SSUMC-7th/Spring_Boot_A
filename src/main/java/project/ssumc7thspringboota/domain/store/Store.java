package project.ssumc7thspringboota.domain.store;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.domain.BaseEntity;
import project.ssumc7thspringboota.domain.mission.Mission;
import project.ssumc7thspringboota.domain.review.Review;
import project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Store extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

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

  @Builder
  private Store(String name, Double overallRating, String location,
      String phoneNumber, String businessHours,
      Set<StoreFoodType> storeFoodTypes, Set<Review> reviews,
      Set<Mission> missions) {
    this.name = name;
    this.overallRating = overallRating;
    this.location = location;
    this.phoneNumber = phoneNumber;
    this.businessHours = businessHours;
    this.storeFoodTypes = storeFoodTypes;
    this.reviews = reviews;
    this.missions = missions;
  }

  @Override
  public String toString() {
    String storeFoodTypesSize = "N/A";
    if (storeFoodTypes != null) {
      storeFoodTypesSize = String.valueOf(storeFoodTypes.size());
    }

    String reviewsSize = "N/A";
    if (reviews != null) {
      reviewsSize = String.valueOf(reviews.size());
    }

    String missionsSize = "N/A";
    if (missions != null) {
      missionsSize = String.valueOf(missions.size());
    }

    return "Store{" +
        "storeId=" + id +
        ", name='" + name + '\'' +
        ", location='" + location + '\'' +
        ", overallRating=" + overallRating +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", businessHours='" + businessHours + '\'' +
        ", storeFoodTypes=" + storeFoodTypesSize +
        ", reviews=" + reviewsSize +
        ", missions=" + missionsSize +
        '}';
  }
}
