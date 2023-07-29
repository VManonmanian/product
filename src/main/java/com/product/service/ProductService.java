package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	public String setProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.setProduct(product);
	}
	public String setAllProduct(List<Product> products) {
		// TODO Auto-generated method stub
		return productDao.setAllProduct(products);
	}
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productDao.getById(id);
	}
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

}
