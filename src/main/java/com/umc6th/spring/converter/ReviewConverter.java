package com.umc6th.spring.converter;

import com.umc6th.spring.domain.Review;
import com.umc6th.spring.web.dto.ReviewRequestDTO;
import com.umc6th.spring.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {

    public static ReviewResponseDTO.AddReviewResultDTO toAddReviewResultDTO(Review review) {
        return ReviewResponseDTO.AddReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.AddReviewDTO request) {
        return Review.builder()
                .content(request.getContent())
                .starRating(request.getStarRating())
                .build();
    }
}
