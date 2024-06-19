package com.umc6th.spring.web.controller;

import com.umc6th.spring.apiPayLoad.ApiResponse;
import com.umc6th.spring.converter.ReviewConverter;
import com.umc6th.spring.domain.Review;
import com.umc6th.spring.service.ReviewService.ReviewCommandService;
import com.umc6th.spring.web.dto.ReviewRequestDTO;
import com.umc6th.spring.web.dto.ReviewResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/reviews")
@RestController
@RequiredArgsConstructor
public class ReviewRestController {
    private final ReviewCommandService reviewCommandService;

    @PostMapping("/")
    public ApiResponse<ReviewResponseDTO.AddReviewResultDTO> createReview(@Valid @RequestBody ReviewRequestDTO.AddReviewDTO request) {
        Review review = reviewCommandService.createReview(request);
        return ApiResponse.onSuccess(ReviewConverter.toAddReviewResultDTO(review));
    }
}
