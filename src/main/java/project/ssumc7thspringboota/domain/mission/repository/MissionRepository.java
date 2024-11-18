package project.ssumc7thspringboota.domain.mission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ssumc7thspringboota.domain.mission.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {
}
