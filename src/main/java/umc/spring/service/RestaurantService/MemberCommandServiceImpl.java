package umc.spring.service.RestaurantService;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.converter.UserConverter;
import umc.spring.converter.UserConverter;
import umc.spring.domain.user;
import umc.spring.repository.UserRepository;
import umc.spring.web.dto.UserRequestDTO;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{
    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    @Override
    @Transactional
    public user joinMember(UserRequestDTO.JoinDto request) {

        user newMember = UserConverter.toMember(request);

        newMember.encodePassword(passwordEncoder.encode(request.getPassword()));

        return userRepository.save(newMember);
    }
}
