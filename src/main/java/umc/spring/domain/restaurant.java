package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_review;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    private Long rating;

    @Column(nullable = false, length = 20)
    private String category;

    @Column(nullable = false)
    private LocalTime open;

    @Column(nullable = false)
    private LocalTime close;

    @OneToMany(mappedBy = "restaurant_id", cascade = CascadeType.ALL)
    private List<mission> missionList = new ArrayList<>();

    @OneToMany(mappedBy = "restaurant_id", cascade = CascadeType.ALL)
    private List<user_review> user_reviewList = new ArrayList<>();
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rating=" + rating + '}';
    }
}
