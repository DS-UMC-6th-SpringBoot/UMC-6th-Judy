package com.umc6th.spring.service.StoreService;

import com.umc6th.spring.domain.Store;
import com.umc6th.spring.web.dto.StoreRequestDTO;

public interface StoreCommandService {
    Store createStore(StoreRequestDTO.AddStoreDTO requestDTO);
}
