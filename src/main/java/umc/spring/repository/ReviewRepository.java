package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Qrestaurant;
import umc.spring.domain.mapping.user_review;
import umc.spring.domain.restaurant;

public interface ReviewRepository extends JpaRepository<user_review, Long> {
    Page<user_review> findAllByRestaurant(restaurant restaurant_id, PageRequest pageRequest);
}
