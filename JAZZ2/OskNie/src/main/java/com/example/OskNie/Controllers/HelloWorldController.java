package com.example.OskNie.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<String> GetHelloWorld(){
        return ResponseEntity.ok().body("Hello World");
    }

    @GetMapping("/hello/{message}")
    public ResponseEntity<String> GetCustomHello(@PathVariable String message){
        return ResponseEntity.ok().body(message);
    }

    @GetMapping("/hello/pjatk")
    public ResponseEntity<String> GetCustomHelloWithReqParameter(@RequestParam String reqParam){
        return ResponseEntity.ok().body(reqParam);
    }
}
