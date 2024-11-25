package umc.study.web.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ChallengeMissionRequestDTO {

    @Getter
    public static class ChallengeMissionDTO{
        @NotNull
        Long missionId;
        @NotNull
        Long memberId;
    }
}
