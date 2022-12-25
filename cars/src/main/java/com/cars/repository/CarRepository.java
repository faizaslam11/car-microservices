package com.cars.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	Optional<Car> findBycompany(String company);
	Optional<Car> findByyear(int year);
	Optional<Car> findBykmd(int kmd);
	List<Car> deleteCarByid(int id);

}
