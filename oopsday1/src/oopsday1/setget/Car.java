package oopsday1.setget;

public class Car {
	//properties-data members, instance variables
	private String color;
	private double price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String brand;
	private String model;

}
