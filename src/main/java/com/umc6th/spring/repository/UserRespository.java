package com.umc6th.spring.repository;

import com.umc6th.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

}
