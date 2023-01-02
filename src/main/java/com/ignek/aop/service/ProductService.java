package com.ignek.aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ignek.aop.model.Product;
import com.ignek.aop.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> addProduct(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

}
