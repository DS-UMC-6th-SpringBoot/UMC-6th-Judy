package com.umc6th.spring.service.StoreService;

import com.umc6th.spring.converter.StoreConverter;
import com.umc6th.spring.domain.Region;
import com.umc6th.spring.domain.Store;
import com.umc6th.spring.repository.RegionRepository;
import com.umc6th.spring.repository.StoreRepository;
import com.umc6th.spring.web.dto.StoreRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreCommandServiceImpl implements StoreCommandService{
    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;

    @Override
    public Store createStore(StoreRequestDTO.AddStoreDTO requestDTO) {
        Region region = regionRepository.findById(requestDTO.getRegionId()).get();
        Store store = StoreConverter.toStore(requestDTO);
        store.setRegion(region);
        return storeRepository.save(store);
    }
}
