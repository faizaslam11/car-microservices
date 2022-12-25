package com.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.entity.Car;
import com.cars.repository.CarRepository;

@Service
public class CarServiceImp implements CarService{
	@Autowired
	
	private CarRepository carRepository;
	
	@Override
	public Car addCar(Car car) {
		return carRepository.save(car);
	}
	
	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}
	
	@Override
	public Car getCarById(int Id) {
		// TODO Auto-generated method stub
		return carRepository.findById(Id).get();
	}
	@Override
	public Car getCarBycompany(String company) {
		// TODO Auto-generated method stub
		return carRepository.findBycompany(company).get();
	}
	@Override
	public Car getCarByyear(int year) {
		// TODO Auto-generated method stub
		return carRepository.findByyear(year).get();
	}
	
	@Override
	public Car getCarBykmd(int kmd) {
		// TODO Auto-generated method stub
		return carRepository.findBykmd(kmd).get();
	}
	@Override
	public List<Car> deleteCarById(int id) {
		// TODO Auto-generated method stub
		return carRepository.deleteCarByid(id);
	}
	
	
}
