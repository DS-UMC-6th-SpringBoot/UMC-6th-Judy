package com.umc6th.spring.service.ReviewService;

import com.umc6th.spring.converter.ReviewConverter;
import com.umc6th.spring.domain.Review;
import com.umc6th.spring.domain.Store;
import com.umc6th.spring.domain.User;
import com.umc6th.spring.repository.ReviewRepository;
import com.umc6th.spring.repository.StoreRepository;
import com.umc6th.spring.repository.UserRepository;
import com.umc6th.spring.web.dto.ReviewRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ReviewCommandServiceImpl implements ReviewCommandService {
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final StoreRepository storeRepository;

    @Override
    @Transactional
    public Review createReview(ReviewRequestDTO.AddReviewDTO requestDTO) {
        User user = userRepository.findById(1L).get();
        Store store = storeRepository.findById(requestDTO.getStoreId()).get();
        Review review = ReviewConverter.toReview(requestDTO);
        review.setUser(user);
        review.setStore(store);
        return reviewRepository.save(review);
    }
}
