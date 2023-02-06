package com.example.carwithcontroller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/CarApi")
public class CarController {


    @PostMapping("/postCar")
    public String postCar(@RequestBody Car car) {
        CarService carService = new CarService(new CarRepository(new ArrayList<>()));
        carService.addCar(car);
        return carService.toString();
    }
    @GetMapping("/getAllCars")
    public List<Car> getAllCars(){
        CarService carService = new CarService(new CarRepository(new ArrayList<>(List.of(
                new Car("Opel", 4, true)))));
        return carService.getCars();
    }
    
}
