package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepo;
	public String setProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return "Product details saved successfully";
	}
	public String setAllProduct(List<Product> products) {
		// TODO Auto-generated method stub
		productRepo.saveAll(products);
		return "Product details saved successfully";
	}
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}
