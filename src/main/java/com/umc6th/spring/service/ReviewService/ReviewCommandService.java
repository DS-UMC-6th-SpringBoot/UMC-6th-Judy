package com.umc6th.spring.service.ReviewService;

import com.umc6th.spring.domain.Review;
import com.umc6th.spring.web.dto.ReviewRequestDTO;

public interface ReviewCommandService {
    Review createReview(ReviewRequestDTO.AddReviewDTO requestDTO);
}
