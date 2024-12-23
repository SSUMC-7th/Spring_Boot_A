package umc.study.web.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.study.domain.enums.MissionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MemberResponseDTO {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResultDTO {
        Long memberId;
        LocalDateTime createdAt;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MissionStateListDTO {
        List<MemberResponseDTO.MissionStatePreViewDTO> memberMissionList;
        Integer currentPage;
        Integer totalElements;
        Boolean isFirst;
        Boolean isLast;


    public static class ReviewPreViewListDTO {
        List<ReviewPreViewDTO> reviewList;
        Integer listSize;
        Integer totalPage;
        Long totalElements;
        Boolean isFirst;
        Boolean isLast;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MissionStatePreViewDTO {
        String storeName;
        Integer reward;
        String missionSpec;
    }
      
    public static class ReviewPreViewDTO {
        String ownerNickname;
        Float score;
        String body;
        String storeName;
        LocalDate createdAt;
    }
}
