package project.ssumc7thspringboota.application.mapping.usermission.request;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserMissionCreateServiceRequest {

  private final Long userId;
  private final Long missionId;
  private final String status;
  private final LocalDateTime startedAt;
  private final LocalDateTime completedAt;
}
