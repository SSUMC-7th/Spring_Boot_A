package umc.spring.converter;

import org.springframework.data.domain.Page;
import umc.spring.domain.mapping.Quser_mission;
import umc.spring.domain.mapping.mission;
import umc.spring.domain.mapping.user_mission;
import umc.spring.domain.mapping.user_review;
import umc.spring.web.dto.StoreResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class StoreConverter {
    public static StoreResponseDTO.ReviewPreViewDTO reviewPreViewDTO(user_review review){
        return StoreResponseDTO.ReviewPreViewDTO.builder()
                .ownerNickname(review.getUser().getName())
                .score(review.getRating())
                .createdAt(review.getDate().toLocalDate())
                .body(review.getContent())
                .build();
    }
    public static StoreResponseDTO.ReviewPreViewListDTO reviewPreViewListDTO(Page<user_review> reviewList){

        List<StoreResponseDTO.ReviewPreViewDTO> reviewPreViewDTOList = reviewList.stream()
                .map(StoreConverter::reviewPreViewDTO).collect(Collectors.toList());

        return StoreResponseDTO.ReviewPreViewListDTO.builder()
                .isLast(reviewList.isLast())
                .isFirst(reviewList.isFirst())
                .totalPage(reviewList.getTotalPages())
                .totalElements(reviewList.getTotalElements())
                .listSize(reviewPreViewDTOList.size())
                .reviewList(reviewPreViewDTOList)
                .build();
    }

    public static StoreResponseDTO.MissionPreViewDTO missionPreViewDTO(mission m){
        return StoreResponseDTO.MissionPreViewDTO.builder()
                .restaurantname(m.getRestaurant().getName())
                .reward(m.getReward())
                .deadline(m.getDeadline())
                .body(m.getContent())
                .build();
    }

    public static StoreResponseDTO.MissionPreViewListDTO missionPreViewListDTO(Page<mission> missionList){

        List<StoreResponseDTO.MissionPreViewDTO> missionPreViewDTOList = missionList.stream()
                .map(StoreConverter::missionPreViewDTO).collect(Collectors.toList());

        return StoreResponseDTO.MissionPreViewListDTO.builder()
                .isLast(missionList.isLast())
                .isFirst(missionList.isFirst())
                .totalPage(missionList.getTotalPages())
                .totalElements(missionList.getTotalElements())
                .listSize(missionPreViewDTOList.size())
                .missionList(missionPreViewDTOList)
                .build();
    }

    public static StoreResponseDTO.UserMissionPreViewDTO usermissionPreViewDTO(user_mission m){
        return StoreResponseDTO.UserMissionPreViewDTO.builder()
                .username(m.getUser().getName())
                .restaurantname(m.getMission().getRestaurant().getName())
                .reward(m.getMission().getReward())
                .deadline(m.getMission().getDeadline())
                .body(m.getMission().getContent())
                .missionCheck(m.getMissioncheck())
                .build();
    }

    public static StoreResponseDTO.UserMissionPreViewListDTO usermissionPreViewListDTO(Page<user_mission> missionList){

        List<StoreResponseDTO.UserMissionPreViewDTO> usermissionPreViewDTOList = missionList.stream()
                .map(StoreConverter::usermissionPreViewDTO).collect(Collectors.toList());

        return StoreResponseDTO.UserMissionPreViewListDTO.builder()
                .isLast(missionList.isLast())
                .isFirst(missionList.isFirst())
                .totalPage(missionList.getTotalPages())
                .totalElements(missionList.getTotalElements())
                .listSize(usermissionPreViewDTOList.size())
                .usermissionList(usermissionPreViewDTOList)
                .build();
    }
}
