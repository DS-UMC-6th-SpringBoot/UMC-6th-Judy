package com.umc6th.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class AddStoreDTO{
        @NotNull
        Long regionId;
        @NotBlank
        String name;
        @NotNull
        boolean isOpen;
        @NotNull
        Float starRating;
        @NotNull
        String address;
    }
}
