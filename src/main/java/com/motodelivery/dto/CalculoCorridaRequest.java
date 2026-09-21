package com.motodelivery.dto;

public class CalculoCorridaRequest {

    private double kmPercorrido; //API 99/Ifood
    private double consumoMedio; //Inserido manualmente
    private double precoLitro; //Inserido manualmente
    private double minimoAceitavel; //Inserido manualmente
    private double valorCorrida; //API 99/Ifood

    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }
    public double getMinimoAceitavel(){
        return minimoAceitavel;
    }
    public void setMinimoAceitavel(double minimoAceitavel){
        this.minimoAceitavel = minimoAceitavel;
    }

    public double getValorCorrida() {
        return valorCorrida;
    }

    public void setValorCorrida(double valorCorrida) {
        this.valorCorrida = valorCorrida;
    }
}