package com.umc6th.spring.web.dto;

import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class AddStoreDTO{

        private Long regionId;

        private String name;

        private boolean isOpen;

        private Float starRating;

        private String address;
    }
}
