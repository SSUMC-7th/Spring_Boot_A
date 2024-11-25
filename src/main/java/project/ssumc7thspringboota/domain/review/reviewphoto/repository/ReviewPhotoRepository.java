package project.ssumc7thspringboota.domain.review.reviewphoto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.review.reviewphoto.ReviewPhoto;

@Repository
public interface ReviewPhotoRepository extends JpaRepository<ReviewPhoto, Long> {
}
