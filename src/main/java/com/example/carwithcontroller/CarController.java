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
    public CarService postCar(@RequestBody Car car) {
        carService.addCar(car);
        return carService;
    }
    @GetMapping("/getAllCars")
    public List<Car> getAllCars(){
       return carService.getCars();
    }
    @DeleteMapping("/deleteCar/{id}")
    public CarService deleteCar(@PathVariable int id){
        carService.deleteCar(id);
        return carService;
    }

    @PutMapping("/putCar/{id}")
    public CarService putCar(@RequestBody Car car, @PathVariable int id){
        if(carService.deleteCar(id).isPresent()) {
            carService.addCar(car);
        }
        return carService;
    }
}
