package project.ssumc7thspringboota.application.mission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.mission.request.MissionCreateServiceRequest;
import project.ssumc7thspringboota.application.mission.response.MissionCreateResponse;
import project.ssumc7thspringboota.domain.mission.Mission;
import project.ssumc7thspringboota.domain.mission.repository.MissionRepository;
import project.ssumc7thspringboota.domain.store.Store;
import project.ssumc7thspringboota.domain.store.repository.StoreRepository;
import project.ssumc7thspringboota.exception.BusinessException;
import project.ssumc7thspringboota.exception.ErrorCode;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MissionService {

  private final MissionRepository missionRepository;
  private final StoreRepository storeRepository;

  @Transactional
  public MissionCreateResponse createMission(MissionCreateServiceRequest request) {
    Store store = storeRepository.findById(request.getStoreId())
                                 .orElseThrow(() -> new BusinessException(ErrorCode.STORE_NOT_FOUND));

    Mission mission = Mission.builder()
                             .store(store)
                             .rewardPoints(request.getRewardPoints())
                             .description(request.getDescription())
                             .build();

    Mission savedMission = missionRepository.save(mission);

    return MissionCreateResponse.from(savedMission);
  }
}
