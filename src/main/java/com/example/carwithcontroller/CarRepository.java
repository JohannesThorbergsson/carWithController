package com.example.carwithcontroller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Repository
public class CarRepository {
    private List<Car> cars;


    public List<Car> addCar(Car car){
        cars.add(car);
        return cars;
    }
    public List<Car> deleteCar(int id) {
        cars =cars.stream().filter(c ->c.id()!=id).collect(Collectors.toList());
        return cars;
    }
}
