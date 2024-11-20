package umc.study.web.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.study.domain.Store;
import umc.study.domain.mapping.MemberMission;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MissionRequestDTO {
    @Getter
    public static class MissionDTO {
        @NotNull
        Integer reward;
        @NotBlank
        String missionSpec;
        @NotNull
        Long storeId;
        @NotNull
        LocalDate deadline;
        //@ExistMemberMission
        List<Long> memberMissions;
    }
}
