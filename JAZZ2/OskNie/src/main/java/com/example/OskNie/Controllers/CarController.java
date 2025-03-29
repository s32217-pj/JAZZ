package com.example.OskNie.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OskNie.Models.Car;

@RestController
public class CarController {
    @GetMapping("/test/car") 
    public ResponseEntity<Car> GetCar(){
        return ResponseEntity.ok().body(new Car("Porsche", "911"));
    }

    @PostMapping("/test/car/model")
    public ResponseEntity<Car> GetCarModel(@RequestBody Car car){
        return ResponseEntity.ok().body(car);
    } 
}
