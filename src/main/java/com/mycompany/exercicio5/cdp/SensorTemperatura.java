/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5.cdp;

/**
 *
 * @author Ricardo
 */
public class SensorTemperatura {
    private double temperaturaAmbiente;
    private ArCondicionadoSystem ar;
    public SensorTemperatura(ArCondicionadoSystem ar) {
        this.ar = ar;
    }
    
    public double getTemperaturaAmbiente() {
        return temperaturaAmbiente;
    }

    public void setTemperaturaAmbiente(int temperaturaAmbiente) {
        this.temperaturaAmbiente = temperaturaAmbiente;
        ar.update();
    }
    
}
