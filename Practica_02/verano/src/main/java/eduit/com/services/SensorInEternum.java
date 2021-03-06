/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.services;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import org.springframework.stereotype.Component;

/**
 *
 * @author Reisel
 */
@Component
public class SensorInEternum {
    private SensorClima sensorClima;
    private SensorVelocidad sensorVelocidad;
    private EvaluadorMultas evaluadorMultas;

    public SensorInEternum(SensorClima sensorClima, SensorVelocidad sensorVelocidad, EvaluadorMultas evaluadorMultas) {
        this.sensorClima = sensorClima;
        this.sensorVelocidad = sensorVelocidad;
        this.evaluadorMultas = evaluadorMultas;
    }
    
    public void sensar(){
        
        TipoClima tipoClima = sensorClima.sensar();
        System.out.println(tipoClima);
        
        for(;;){
            DatosVehiculo datosVehiculos = sensorVelocidad.sensarVehiculo();
            System.out.println(datosVehiculos);
            evaluadorMultas.evaluar(tipoClima, datosVehiculos);
        }
    }
    
}
