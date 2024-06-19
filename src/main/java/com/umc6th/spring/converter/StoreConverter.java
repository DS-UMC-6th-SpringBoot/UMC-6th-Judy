package com.umc6th.spring.converter;

import com.umc6th.spring.domain.Store;
import com.umc6th.spring.web.dto.StoreRequestDTO;
import com.umc6th.spring.web.dto.StoreResponseDTO;

import java.time.LocalDateTime;

public class StoreConverter {

    public static StoreResponseDTO.AddStoreResultDTO toAddStoreResultDTO(Store store) {
        return StoreResponseDTO.AddStoreResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Store toStore(StoreRequestDTO.AddStoreDTO request){
        return Store.builder()
                .name(request.getName())
                .isOpen(request.isOpen())
                .starRating(request.getStarRating())
                .address(request.getAddress())
                .build();
    }
}
