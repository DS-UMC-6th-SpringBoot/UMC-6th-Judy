package com.umc6th.spring.service.UserService;

import com.umc6th.spring.apiPayLoad.code.status.ErrorStatus;
import com.umc6th.spring.apiPayLoad.exception.handler.FoodCategoryHandler;
import com.umc6th.spring.converter.UserConverter;
import com.umc6th.spring.converter.UserFoodConverter;
import com.umc6th.spring.domain.FoodCategory;
import com.umc6th.spring.domain.User;
import com.umc6th.spring.domain.mapping.UserFood;
import com.umc6th.spring.repository.FoodCategoryRepository;
import com.umc6th.spring.repository.UserRepository;
import com.umc6th.spring.web.dto.UserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserCommandServiceImpl implements UserCommandService {

    private final UserRepository userRepository;

    private final FoodCategoryRepository foodCategoryRepository;


    @Override
    @Transactional
    public User joinUser(UserRequestDTO.JoinDto request) {

        User newUser = UserConverter.toUser(request);
        List<FoodCategory> foodCategoryList = request.getUserFoodList().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<UserFood> userFoodList = UserFoodConverter.toUserFoodList(foodCategoryList);

        userFoodList.forEach(userFood -> {userFood.setUser(newUser);});

        return userRepository.save(newUser);
    }
}
