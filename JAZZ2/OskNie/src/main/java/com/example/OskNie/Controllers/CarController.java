package com.example.OskNie.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OskNie.Models.Car;
import com.example.OskNie.Services.CarService;

@RestController
public class CarController {

    CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/test/car") 
    public ResponseEntity<Car> GetCar(){
        return ResponseEntity.ok().body(carService.CreateNewCar("Test Manufacturer", "Test model"));
    }

    @PostMapping("/test/car/model")
    public ResponseEntity<Car> GetCarModel(@RequestBody Car car){
        return ResponseEntity.ok().body(car);
    }

    @GetMapping("/test/exception")
    public ResponseEntity<Void> GetNullException(){
        throw new NullPointerException("Null pointer exception test");
    }
}
