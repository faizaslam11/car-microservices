package com.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.entity.Car;
import com.cars.service.CarService;


@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;
	@PostMapping("/addcar")
	public Car addCar(@RequestBody Car car) {
		return carService.addCar(car);
	}
	@GetMapping("/getcardetails")
	public List<Car> getAllCars(){    //this can make error
		return carService.getAllCars();
	}
	
	@GetMapping("/car/{id}")
	public Car getCarById(@PathVariable("id") int cId){
		return carService.getCarById(cId);
	}
	@GetMapping("company/{company}")
	public Car getCarByCompany(@PathVariable("company") String ccompany) {
		return carService.getCarBycompany(ccompany);
	}
	@GetMapping("car/year/{year}")
	public Car getCarByyear(@PathVariable("year") int cyear) {
		return carService.getCarByyear(cyear);
	}
	@GetMapping("/kmd/{kmd}")
	public Car getCarBykmd(@PathVariable("kmd") int ckmd) {
		return carService.getCarBykmd(ckmd);
	}
	@DeleteMapping(value = "delete/{id}")
	public List<Car> deleteCarById(@PathVariable("id") int cid){
		return carService.deleteCarById(cid);
	}

	
}
