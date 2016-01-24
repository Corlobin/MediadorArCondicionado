/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio5.application;

import com.mycompany.exercicio5.cdp.ArCondicionadoSystem;
import com.mycompany.exercicio5.cdp.SensorPessoa;
import com.mycompany.exercicio5.cdp.SensorTemperatura;

/**
 *
 * @author Ricardo
 */
public class Application {
    public static void main(String args[]) {
        ArCondicionadoSystem ar = new ArCondicionadoSystem();
        SensorPessoa sensorP1 = new SensorPessoa(ar);
        ar.registraSensorPessoa(sensorP1);
        sensorP1.setQuantidadePessoas(3);
        SensorPessoa sensorP2 = new SensorPessoa(ar);
        ar.registraSensorPessoa(sensorP2);
        sensorP2.setQuantidadePessoas(2);
        SensorPessoa sensorP3 = new SensorPessoa(ar);
        ar.registraSensorPessoa(sensorP3);
        sensorP3.setQuantidadePessoas(4);
        
        SensorTemperatura sensorT1 = new SensorTemperatura(ar);
        ar.registraSensorTemperatura(sensorT1);
        sensorT1.setTemperaturaAmbiente(10);
        SensorTemperatura sensorT2 = new SensorTemperatura(ar);
        ar.registraSensorTemperatura(sensorT2);
        sensorT2.setTemperaturaAmbiente(14);
        SensorTemperatura sensorT3 = new SensorTemperatura(ar);
        ar.registraSensorTemperatura(sensorT3);
        sensorT3.setTemperaturaAmbiente(16);
        
        
        
        
    }
}
