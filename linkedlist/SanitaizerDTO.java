package com.xworkz.collection.linkedlist.sanitizer.DTO;

public class SanitaizerDTO {
	
	public int id;
	public String brand;
	public Double price;
	public String color;
	
	
	public SanitaizerDTO(){
		
	}
	
	public SanitaizerDTO(int id, String brand, Double price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitaizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	

}
