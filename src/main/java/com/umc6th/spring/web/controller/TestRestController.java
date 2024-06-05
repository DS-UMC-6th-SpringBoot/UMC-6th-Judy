package com.umc6th.spring.web.controller;

import com.umc6th.spring.apiPayLoad.ApiResponse;
import com.umc6th.spring.converter.TestConverter;
import com.umc6th.spring.service.TestService.TestQueryService;
import com.umc6th.spring.web.dto.TestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/judy")
@RequiredArgsConstructor
public class TestRestController {

    private final TestQueryService testQueryService;

    @GetMapping("/test")
    public ApiResponse<TestResponse.JudyTestDTO> testAPI(){
        return ApiResponse.onSuccess(TestConverter.toJudyTestDTO());
    }

    @GetMapping("/exception")
    public ApiResponse<TestResponse.JudyExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        testQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TestConverter.toJudyExceptionDTO(flag));
    }
}
