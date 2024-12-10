package umc.spring.service.RestaurantService;

import umc.spring.domain.user;
import umc.spring.web.dto.UserRequestDTO;

public interface MemberCommandService {
    public user joinMember(UserRequestDTO.JoinDto request);
}
