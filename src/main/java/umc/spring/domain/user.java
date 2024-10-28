package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_favorite;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.mapping.user_review;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @Column(nullable = false)
    private LocalDate birth;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone_num;

    @Column(nullable = false)
    private Long mission_count;

    @Column(nullable = false)
    private Long point;

    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<user_favorite> user_favoriteList = new ArrayList<>();

    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<user_mission> user_missionList = new ArrayList<>();

    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<user_review> user_reviewList = new ArrayList<>();
}
