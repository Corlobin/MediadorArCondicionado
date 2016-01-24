/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5.cdp;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class ArCondicionadoSystem {
    private ArrayList<SensorPessoa> sensorPessoas;
    private ArrayList<SensorTemperatura> sensorTemperaturas;

    private double temperaturaAtual;
    public ArCondicionadoSystem() {
        sensorPessoas = new ArrayList<>();
        sensorTemperaturas = new ArrayList<>();
    }
    
    public void registraSensorPessoa(SensorPessoa sensorPessoa) {
        sensorPessoas.add(sensorPessoa);        
    }
    public void registraSensorTemperatura(SensorTemperatura sensorTemperatura) {
        sensorTemperaturas.add(sensorTemperatura);
    }
    public void calculaTemperatura() {
        double mediaT = 0, mediaP = 0;
        if(sensorTemperaturas.size() > 0) {
            for(SensorTemperatura sensor: sensorTemperaturas) {
                mediaT += sensor.getTemperaturaAmbiente();
            }

            mediaT /= sensorTemperaturas.size();
        }
        if(sensorPessoas.size() > 0) {
            for(SensorPessoa sensor: sensorPessoas){
                mediaP += sensor.getQuantidadePessoas();
            }
            mediaP /= sensorPessoas.size();
        }
        temperaturaAtual = mediaT + mediaP;        
    }

    public void update() {
        calculaTemperatura();
        System.out.printf("Temperatura estabilizando em.. %.2f graus\n", temperaturaAtual );
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }
    
}
