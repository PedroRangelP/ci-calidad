package com.example.demo.controller;

import com.example.demo.model.SumaRequest;
import com.example.demo.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class PruebaController {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("prueba")
    String helloWorld(){
        return "Hello World";
    }

    @PostMapping("suma")
    double suma(@RequestBody SumaRequest sumaRequest){
        return pruebaService.suma(sumaRequest.getA(),sumaRequest.getB());
    }
}