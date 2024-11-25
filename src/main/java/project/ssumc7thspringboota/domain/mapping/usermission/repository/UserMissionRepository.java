package project.ssumc7thspringboota.domain.mapping.usermission.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;

@Repository
public interface UserMissionRepository extends JpaRepository<UserMission, Long> {
  Page<UserMission> findByUserIdAndStatus(Long userId, String status, Pageable pageable);
}
