package com.motodelivery.controller;

import com.motodelivery.dto.CalculoCorridaRequest;
import com.motodelivery.service.CalculadoraCorrida;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.motodelivery.dto.CalculoCorridaRequest;



@RestController
public class CorridaController {

    private final CalculadoraCorrida calculadoraCorrida;

    public CorridaController (CalculadoraCorrida calculadoraCorrida){
        this.calculadoraCorrida = calculadoraCorrida;
    }

    @PostMapping("/corridas/calcular")
    public CalculoCorridaRequest calcular (@RequestBody CalculoCorridaRequest request){
        return request;
    }
}
