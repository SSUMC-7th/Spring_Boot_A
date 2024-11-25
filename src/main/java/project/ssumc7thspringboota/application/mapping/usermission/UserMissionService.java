package project.ssumc7thspringboota.application.mapping.usermission;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.mapping.usermission.request.UserMissionCreateServiceRequest;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionCreateResponse;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;
import project.ssumc7thspringboota.domain.mapping.usermission.repository.UserMissionRepository;
import project.ssumc7thspringboota.domain.mission.Mission;
import project.ssumc7thspringboota.domain.mission.repository.MissionRepository;
import project.ssumc7thspringboota.domain.user.User;
import project.ssumc7thspringboota.domain.user.repository.UserRepository;
import project.ssumc7thspringboota.exception.BusinessException;
import project.ssumc7thspringboota.exception.ErrorCode;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserMissionService {

  private final UserMissionRepository userMissionRepository;
  private final UserRepository userRepository;
  private final MissionRepository missionRepository;

  @Transactional
  public UserMissionCreateResponse createUserMission(UserMissionCreateServiceRequest request) {
    User user = userRepository.findById(request.getUserId())
                              .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));
    Mission mission = missionRepository.findById(request.getMissionId())
                                       .orElseThrow(() -> new BusinessException(ErrorCode.MISSION_NOT_FOUND));

    UserMission userMission = UserMission.builder()
                                         .user(user)
                                         .mission(mission)
                                         .status(request.getStatus())
                                         .startedAt(request.getStartedAt())
                                         .completedAt(request.getCompletedAt())
                                         .build();

    UserMission savedUserMission = userMissionRepository.save(userMission);

    return UserMissionCreateResponse.from(savedUserMission);
  }
}
