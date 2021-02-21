/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import eduit.com.services.EvaluadorMultas;
import eduit.com.repository.GrabadorMultaJson;
import eduit.com.services.SensorInEternum;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Init implements CommandLineRunner {
    
    @Autowired
    SensorInEternum SensorInEternum;
    
    //Es reemplazado por el codigo anterior, junto con el Component de la clase SensorInEternum
//    private static SensorInEternum factory(){
//        return new SensorInEternum(
//                new SensorClima(),
//                new SensorVelocidad(),
//                new EvaluadorMultas(
//                        new GrabadorMultaJson()
//                )
//        );
//    }
    
    @Override
    public void run(String... args) throws Exception {
            SensorInEternum.sensar();
         
         //Es reemplazado por el Codigo anterior   
        //factory().sensar();
    }
    
    
}
