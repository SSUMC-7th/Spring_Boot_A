package umc.study.web.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.study.domain.Member;
import umc.study.domain.Store;

public class ReviewRequestDTO {
    @Getter
    public static class CreateReviewDTO {
        @NotNull
        String body;
        @NotNull
        Float score;
        @NotNull
        Member member;
        @NotNull
        Store store;
    }
}
