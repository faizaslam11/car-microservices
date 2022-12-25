package com.cars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
//@Data
public class Car {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String company;
	private String model;
	private int year;
	private int kmd;
	private int price;
	
	public Car() {
		
	}
	public Car(int id, String company, String model, int year, int kmd, int price) {
		super();
		this.id = id;
		this.company = company;
		this.model = model;
		this.year = year;
		this.kmd = kmd;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getKmd() {
		return kmd;
	}
	public void setKmd(int kmd) {
		this.kmd = kmd;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
