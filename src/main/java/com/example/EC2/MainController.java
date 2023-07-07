package com.example.EC2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String alumno(){
        return "PI73117002 - SALINAS PORTILLA DAVID";
    }

    @GetMapping("/idat/codigo")
    public String codigo(){
        return "PI73117002";
    }

    @GetMapping("/idat/nombre-completo")
    public String nombre(){
        return "SALINAS PORTILLA DAVID";
    }
}
