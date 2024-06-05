package com.umc6th.spring.apiPayLoad.exception;

import com.umc6th.spring.apiPayLoad.code.BaseErrorCode;
import com.umc6th.spring.apiPayLoad.code.ErrorReasonDTO;
import lombok.*;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}