package com.example.OskNie.Services;

import org.springframework.stereotype.Service;

import com.example.OskNie.Models.Car;

@Service
public class CarService {
    //public CarRepository carRepo;
    public CarService(/*CarRepository carRepo */){
        /*this.carRepo = carRepo; */
    }

    public Car CreateNewCar(String manufacturer, String model){
        return new Car(manufacturer, model);
    }

    /*public Optional<Car> GetCarByID(long ID){
        return carRepo.findByID(ID);
    }
     * 
     */
}
