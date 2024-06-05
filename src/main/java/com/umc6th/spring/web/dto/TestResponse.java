package com.umc6th.spring.web.dto;

import lombok.*;

public class TestResponse {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JudyTestDTO {
        String testString;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JudyExceptionDTO {
        Integer flag;
    }
}
