package project.ssumc7thspringboota.application.mapping.usermission;

import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ssumc7thspringboota.application.mapping.usermission.request.UserMissionCreateServiceRequest;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionCompleteResponse;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionCreateResponse;
import project.ssumc7thspringboota.application.mapping.usermission.response.UserMissionListResponse;
import project.ssumc7thspringboota.domain.mapping.usermission.UserMission;
import project.ssumc7thspringboota.domain.mapping.usermission.repository.UserMissionRepository;
import project.ssumc7thspringboota.domain.mission.Mission;
import project.ssumc7thspringboota.domain.mission.repository.MissionRepository;
import project.ssumc7thspringboota.domain.user.User;
import project.ssumc7thspringboota.domain.user.repository.UserRepository;
import project.ssumc7thspringboota.common.exception.BusinessException;
import project.ssumc7thspringboota.common.exception.ErrorCode;

@Service
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
                                         .status("IN_PROGRESS")
                                         .startedAt(LocalDateTime.now())
                                         .build();

    UserMission savedUserMission = userMissionRepository.save(userMission);

    return UserMissionCreateResponse.from(savedUserMission);
  }

  @Transactional
  public Page<UserMissionListResponse> getUserInProgressMissions(Long userId,
      PageRequest pageRequest) {
    User user = userRepository.findById(userId)
                              .orElseThrow(() -> new BusinessException(ErrorCode.USER_NOT_FOUND));

    Page<UserMission> userMissions = userMissionRepository.findByUserIdAndStatus(user.getId(), "IN_PROGRESS", pageRequest);

    return userMissions.map(UserMissionListResponse::from);
  }

  @Transactional
  public UserMissionCompleteResponse completeUserMission(Long userMissionId) {
    UserMission userMission = userMissionRepository.findById(userMissionId)
                                                   .orElseThrow(() -> new BusinessException(ErrorCode.MISSION_NOT_FOUND));

    userMission.completeMission();
    return UserMissionCompleteResponse.from(userMission);
  }
}
