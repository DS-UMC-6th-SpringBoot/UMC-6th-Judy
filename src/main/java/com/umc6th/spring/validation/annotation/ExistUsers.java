package com.umc6th.spring.validation.annotation;

import com.umc6th.spring.validation.validater.UserExistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserExistValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistUsers {

    String message() default "해당하는 유저가 존재하지 않습니다.";
    Class<?>[] groups() default  {};
    Class<? extends Payload>[] payload() default {};

}
