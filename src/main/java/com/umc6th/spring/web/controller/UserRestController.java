package com.umc6th.spring.web.controller;

import com.umc6th.spring.apiPayLoad.ApiResponse;
import com.umc6th.spring.converter.UserConverter;
import com.umc6th.spring.domain.User;
import com.umc6th.spring.service.UserService.UserCommandService;
import com.umc6th.spring.web.dto.UserRequestDTO;
import com.umc6th.spring.web.dto.UserResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {

    private final UserCommandService userCommandService;

    @PostMapping("/")
    public ApiResponse<UserResponseDTO.JoinResultDTO> join(@RequestBody @Valid UserRequestDTO.JoinDto request){
        User user = userCommandService.joinUser(request);
        return ApiResponse.onSuccess(UserConverter.toJoinResultDTO(user));
    }
}
