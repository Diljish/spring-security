package com.diljish.coupon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diljish.coupon.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
	Coupon findByCode(String code);

}
