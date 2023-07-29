package com.product.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController 
public class ProductControler {
	@Autowired
	ProductService productService;
	@PostMapping("/setProduct")
	public String setProduct(@RequestBody Product product) {
		return productService.setProduct(product);
	}
	@PostMapping("/setAllProduct")
	public String setAllProduct(@RequestBody List<Product> products) {
		return productService.setAllProduct(products);
	}
	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable int id) {
		return productService.getById(id);
	}
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	@GetMapping("/getString")
	public String getString() {
		return "hellow";
	}

}
