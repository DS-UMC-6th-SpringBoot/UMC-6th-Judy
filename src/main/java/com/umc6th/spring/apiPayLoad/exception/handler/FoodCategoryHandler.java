package com.umc6th.spring.apiPayLoad.exception.handler;

import com.umc6th.spring.apiPayLoad.code.BaseErrorCode;
import com.umc6th.spring.apiPayLoad.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {

    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
