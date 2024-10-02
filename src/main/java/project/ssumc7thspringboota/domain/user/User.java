package project.ssumc7thspringboota.domain.user;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.domain.BaseEntity;
import project.ssumc7thspringboota.domain.review.Review;
import project.ssumc7thspringboota.domain.usermission.UserMission;
import project.ssumc7thspringboota.domain.userpreferredfoodtype.UserPreferredFoodType;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(length = 100, nullable = false)
  private String name;

  @Column(length = 100, unique = true, nullable = false)
  private String email;

  private Integer points;

  @Column(length = 10)
  private String gender;

  private LocalDate dateOfBirth;

  @Column(length = 255)
  private String address;

  @Column(length = 15)
  private String phoneNumber;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<UserPreferredFoodType> preferredFoodTypes;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<Review> reviews;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<UserMission> userMissions;
}
