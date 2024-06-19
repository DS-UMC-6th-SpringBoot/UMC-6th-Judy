package com.umc6th.spring.validation.annotation;

import com.umc6th.spring.validation.validater.RegionExistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RegionExistValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistRegions {

    String message() default "해당하는 지역이 존재하지 않습니다.";
    Class<?>[] groups() default  {};
    Class<? extends Payload>[] payload() default {};


}
