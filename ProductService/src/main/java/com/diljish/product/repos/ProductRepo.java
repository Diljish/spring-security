package com.diljish.product.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diljish.product.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
