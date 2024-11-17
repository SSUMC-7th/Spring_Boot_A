package project.ssumc7thspringboota.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.domain.BaseEntity;
import project.ssumc7thspringboota.domain.inquiry.Inquiry;
import project.ssumc7thspringboota.domain.review.Review;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;
import project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(unique = true, nullable = false)
  private String email;

  private Integer points;

  private String gender;

  private LocalDate dateOfBirth;

  private String address;

  private String phoneNumber;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<UserPreferredFoodType> preferredFoodTypes;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<Review> reviews;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<UserMission> userMissions;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<Inquiry> inquiries;

  @Builder
  public User(String name, String email, Integer points, String gender,
      LocalDate dateOfBirth, String address, String phoneNumber,
      Set<UserPreferredFoodType> preferredFoodTypes, Set<Review> reviews,
      Set<UserMission> userMissions, Set<Inquiry> inquiries) {
    this.name = name;
    this.email = email;
    this.points = points != null ? points : 0;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.preferredFoodTypes = preferredFoodTypes;
    this.reviews = reviews;
    this.userMissions = userMissions;
    this.inquiries = inquiries;
  }
}
