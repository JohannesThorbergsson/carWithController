package com.example.carwithcontroller;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Car> deleteCar(int id){
        return carRepository.deleteCar(id);
    }
}
