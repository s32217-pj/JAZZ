package com.example.OskNie.Controllers;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.OskNie.Models.Car;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    @GetMapping("/print/{message}")
    public ResponseEntity<String> GetPrintMessage(@PathVariable String message){
        return ResponseEntity.ok().body(message);
    }

    @GetMapping("/slashes")
    public ResponseEntity<String> GetPrintSlashes(@RequestParam int amount){
        if(amount < 1)
            return ResponseEntity.badRequest().body("Amount of slashes must be positive and greater than 0");

        return ResponseEntity.ok().body("/".repeat(amount));
    }

    @PutMapping("/put-test/{manufacturer}")
    public ResponseEntity<Car> PutRequestTest(@PathVariable String manufacturer, @RequestParam String model){
        return ResponseEntity.ok().body(new Car(manufacturer, model));
    } 

    @PostMapping("/post-test")
    public ResponseEntity<Car> PostRequestTest(@RequestBody Car car){
        return ResponseEntity.ok().body(car);
    }

    @DeleteMapping("/delete-test/{id}")
    public ResponseEntity<Void> DeleteRequestTest(@PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
