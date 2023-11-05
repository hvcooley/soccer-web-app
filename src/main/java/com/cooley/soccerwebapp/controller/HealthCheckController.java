package com.cooley.soccerwebapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController {

    @GetMapping("/test")
    public ResponseEntity<Object> healthCheck(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
