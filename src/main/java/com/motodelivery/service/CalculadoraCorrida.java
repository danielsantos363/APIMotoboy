package com.motodelivery.service;
import org.springframework.stereotype.Service;

@Service

public class CalculadoraCorrida {

    public double calcularCustoCombustivel(
            double kmPercorrido,
            double consumoMedio,
            double precoLitro) {

        return (kmPercorrido / consumoMedio) * precoLitro;
    }

    public double calcularLucroLiquido(
            double valorCorrida,
            double custoTotal) {

        return valorCorrida - custoTotal;
    }

    public double calcularLucroPorKm(
            double lucroLiquido,
            double kmPercorrido) {

        return lucroLiquido / kmPercorrido;
    }

    public boolean atingiuMinimoAceitavel(
            double lucroPorKm,
            double minimoAceitavel) {

        return lucroPorKm >= minimoAceitavel;
    }
}