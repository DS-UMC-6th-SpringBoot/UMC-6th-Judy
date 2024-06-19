package com.umc6th.spring.web.dto;

import com.umc6th.spring.validation.annotation.ExistStores;
import com.umc6th.spring.validation.annotation.ExistUsers;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class ReviewRequestDTO {

    @Getter
    public static class AddReviewDTO{
        @ExistStores
        Long storeId;
        @NotBlank
        String content;
        @NotNull
        Float starRating;
    }
}
