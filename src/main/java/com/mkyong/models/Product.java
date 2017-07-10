package com.mkyong.models;

public class Product {
	private int id;
	private String serialNumber;
	private String description;

	public Product(int id, String serialNumber, String description) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
