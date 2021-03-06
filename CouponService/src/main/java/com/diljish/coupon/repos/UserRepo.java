package com.diljish.coupon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diljish.coupon.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
