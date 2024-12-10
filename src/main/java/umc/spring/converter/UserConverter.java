package umc.spring.converter;

import org.apache.catalina.User;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.user;
import umc.spring.web.dto.UserRequestDTO;

import java.lang.reflect.Member;

public class UserConverter {
    public static user toMember(UserRequestDTO.JoinDto request) {
        Gender gender = null;
        switch (request.getGender()) {
            case MALE: gender = Gender.MALE; break;
            case FEMALE: gender = Gender.FEMALE; break;
        }
        System.out.println(request.getPassword());

        return user.builder()
                .name(request.getName())
                .email(request.getEmail())   // 추가된 코드
                .password(request.getPassword())   // 추가된 코드
                .gender(gender)
                .birth(request.getBirth())
                .address(request.getAddress())
                .role(request.getRole())   // 추가된 코드
                .build();
    }
    // ... 기타 메소드들 ...
}