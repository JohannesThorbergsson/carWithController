package com.example.carwithcontroller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/CarApi")
public class CarController {
    CarService carService = new CarService(new CarRepository(new ArrayList<>(List.of(
            new Car("Opel", 4, true, 42)))));

    @PostMapping("/postCar")
    public String postCar(@RequestBody Car car) {
        carService.addCar(car);
        return carService.toString();
    }
    @GetMapping("/getAllCars")
    public List<Car> getAllCars(){
       return carService.getCars();
    }
    @DeleteMapping("/deleteCar/{id}")
    public String deleteCar(@PathVariable int id){
        carService.deleteCar(id);
        return carService.toString();
    }

    @PutMapping("/putCar/{id}")
    public String putCar(@RequestBody Car car, @PathVariable int id){
        carService.deleteCar(id);
        carService.addCar(car);
        return carService.toString();

    }
}
