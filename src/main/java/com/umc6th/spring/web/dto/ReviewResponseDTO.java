package com.umc6th.spring.web.dto;

import lombok.*;

import java.time.LocalDateTime;

public class ReviewResponseDTO {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddReviewResultDTO{
        Long reviewId;
        LocalDateTime createdAt;
    }
}
