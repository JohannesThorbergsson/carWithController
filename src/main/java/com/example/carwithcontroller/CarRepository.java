package com.example.carwithcontroller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import java.util.List;

import java.util.List;
@Data
@AllArgsConstructor
public class CarRepository {
    private List<Car> cars;


    public List<Car> addCar(Car car){
        cars.add(car);
        return cars;
    }



}
