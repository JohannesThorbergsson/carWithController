package com.example.carwithcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/CarApi")
public class CarController {


    @PostMapping("/postCar")
    public String postCar(@RequestBody Car car) {
        CarService carService = new CarService(new CarRepository(new ArrayList<>()));
        carService.addCar(car);
        return carService.toString();
    }
}
