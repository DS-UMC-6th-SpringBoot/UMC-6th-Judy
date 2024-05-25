package com.umc6th.spring.apiPayLoad.exception.handler;

import com.umc6th.spring.apiPayLoad.code.BaseErrorCode;
import com.umc6th.spring.apiPayLoad.exception.GeneralException;

public class TestHandler extends GeneralException {

    public TestHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
