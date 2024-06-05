package com.umc6th.spring.converter;

import com.umc6th.spring.domain.FoodCategory;
import com.umc6th.spring.domain.mapping.UserFood;

import java.util.List;
import java.util.stream.Collectors;

public class UserFoodConverter {

    public static List<UserFood> toUserFoodList(List<FoodCategory> foodCategoryList) {

        return foodCategoryList.stream()
                .map(foodCategory ->
                        UserFood.builder()
                                .foodCategory(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
