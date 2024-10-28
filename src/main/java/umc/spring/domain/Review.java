package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer score;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Region> RegionList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Member> MemberList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Restaurant> RestaurantList = new ArrayList<>();
}
