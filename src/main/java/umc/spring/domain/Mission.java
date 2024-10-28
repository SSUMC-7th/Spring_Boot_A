package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.enums.Status;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isSuccess;

    @Column(nullable = false, length = 100)
    private String content;

    private Integer code;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10) DEFAULT 'ACTIVE'")
    private Status status;

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Region> RegionList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Member> MemberList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Restaurant> RestaurantList = new ArrayList<>();
}
