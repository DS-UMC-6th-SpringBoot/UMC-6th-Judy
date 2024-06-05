package com.umc6th.spring.converter;

import com.umc6th.spring.web.dto.TestResponse;

public class TestConverter {
    public static TestResponse.JudyTestDTO toJudyTestDTO(){
        return TestResponse.JudyTestDTO.builder()
                .testString("This is Test!")
                .build();
    }

    public static TestResponse.JudyExceptionDTO toJudyExceptionDTO(Integer flag){
        return TestResponse.JudyExceptionDTO.builder()
                .flag(flag)
                .build();
    }
}
