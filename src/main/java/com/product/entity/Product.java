package com.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_details")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name,brand,quality,color;
	private int price,quantity,rating,hssn_Code;
	public Product() {
		super();
	}
	public Product(int id, String name, String brand, String quality, String color, int price, int quantity, int rating,
			int hssn_Code) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.quality = quality;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.rating = rating;
		this.hssn_Code = hssn_Code;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getHssn_Code() {
		return hssn_Code;
	}
	public void setHssn_Code(int hssn_Code) {
		this.hssn_Code = hssn_Code;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", quality=" + quality + ", color=" + color
				+ ", price=" + price + ", quantity=" + quantity + ", rating=" + rating + ", hssn_Code=" + hssn_Code
				+ "]";
	}
	

}
