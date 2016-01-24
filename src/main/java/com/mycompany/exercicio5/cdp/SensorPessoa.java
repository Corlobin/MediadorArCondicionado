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
public class SensorPessoa {
    private int quantidadePessoas;
    private ArCondicionadoSystem ar;

    public SensorPessoa(ArCondicionadoSystem ar) {
        this.ar = ar;
    }
    
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
        ar.update();
    }
    
}
