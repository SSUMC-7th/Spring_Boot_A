package project.ssumc7thspringboota.domain.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.review.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
