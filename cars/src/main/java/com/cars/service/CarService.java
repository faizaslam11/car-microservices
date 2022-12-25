package com.cars.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cars.entity.Car;
@Service
public interface CarService {
	
	public Car addCar(Car car);
	
	public List<Car> getAllCars();
	
	public Car getCarById(int Id);
	
	public Car getCarBycompany(String company);
	
	public Car getCarByyear(int year);
	
	public Car getCarBykmd(int kmd);
	
	public List<Car> deleteCarById(int id);
	
}
