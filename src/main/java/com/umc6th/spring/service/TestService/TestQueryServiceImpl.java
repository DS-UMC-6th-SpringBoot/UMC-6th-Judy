package com.umc6th.spring.service.TestService;

import com.umc6th.spring.apiPayLoad.code.status.ErrorStatus;
import com.umc6th.spring.apiPayLoad.exception.handler.TestHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestQueryServiceImpl implements TestQueryService {

    @Override
    public void CheckFlag(Integer flag){
        if (flag == 1)
            throw new TestHandler(ErrorStatus.JUDY_EXCEPTION);
    }
}
