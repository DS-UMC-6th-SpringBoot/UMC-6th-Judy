package com.umc6th.spring.service.UserService;

import com.umc6th.spring.domain.User;
import com.umc6th.spring.web.dto.UserRequestDTO;

public interface UserCommandService {
    User joinUser(UserRequestDTO.JoinDto request);
}
