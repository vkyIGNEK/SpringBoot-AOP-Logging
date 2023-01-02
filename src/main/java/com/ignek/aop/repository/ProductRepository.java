package com.ignek.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ignek.aop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
