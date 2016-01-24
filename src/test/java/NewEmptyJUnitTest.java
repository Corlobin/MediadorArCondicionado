/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.exercicio5.cdp.ArCondicionadoSystem;
import com.mycompany.exercicio5.cdp.SensorPessoa;
import com.mycompany.exercicio5.cdp.SensorTemperatura;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo
 */
public class NewEmptyJUnitTest {
    
   
    @Test
    public void TestaSensorPessoa() {
        ArCondicionadoSystem ar = new ArCondicionadoSystem();
        SensorPessoa sensor = new SensorPessoa(ar);
        assertEquals(sensor.getQuantidadePessoas(), 0);
    }
    @Test
    public void TestaTemperatura() {
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
        assertEquals(Math.round(ar.getTemperaturaAtual()), 16, 0);
    }
}
