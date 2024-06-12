package com.umc6th.spring.repository;

import com.umc6th.spring.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
