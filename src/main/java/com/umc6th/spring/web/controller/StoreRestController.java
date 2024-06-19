package com.umc6th.spring.web.controller;

import com.umc6th.spring.apiPayLoad.ApiResponse;
import com.umc6th.spring.converter.StoreConverter;
import com.umc6th.spring.domain.Store;
import com.umc6th.spring.service.StoreService.StoreCommandService;
import com.umc6th.spring.web.dto.StoreRequestDTO;
import com.umc6th.spring.web.dto.StoreResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stores")
@RestController
@RequiredArgsConstructor
public class StoreRestController {
    private final StoreCommandService storeCommandService;

    @PostMapping("/")
    public ApiResponse<StoreResponseDTO.AddStoreResultDTO> createStore(@Valid @RequestBody StoreRequestDTO.AddStoreDTO request) {
        Store store = storeCommandService.createStore(request);
        return ApiResponse.onSuccess(StoreConverter.toAddStoreResultDTO(store));
    }
}
