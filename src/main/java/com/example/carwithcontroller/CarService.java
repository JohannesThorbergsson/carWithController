package com.example.carwithcontroller;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@ToString
@Service
public class CarService {

    private CarRepository carRepository;


    public CarRepository addCar(Car car) {
        carRepository.addCar(car);
        return carRepository;
    }
    public List<Car> getCars(){
        return carRepository.getCars();
    }
}
