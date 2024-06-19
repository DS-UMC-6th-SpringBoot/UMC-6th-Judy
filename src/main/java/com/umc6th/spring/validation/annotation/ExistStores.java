package com.umc6th.spring.validation.annotation;

import com.umc6th.spring.validation.validater.StoreExistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = StoreExistValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistStores {

    String message() default "해당하는 가게가 존재하지 않습니다.";
    Class<?>[] groups() default  {};
    Class<? extends Payload>[] payload() default {};
}
