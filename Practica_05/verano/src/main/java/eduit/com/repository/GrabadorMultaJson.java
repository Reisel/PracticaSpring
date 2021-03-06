/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.repository;

import com.google.gson.Gson;
import eduit.com.model.Ticket;
import eduit.com.repository.GrabadorMulta;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Reisel
 */
@Repository("GRABADOR_JSON")
public class GrabadorMultaJson implements GrabadorMulta {
    
    @Value("${pathTickets}")
    private String pathTickets;

    @Override
    public void grabar(Ticket t) {
        //System.out.println("Grabando ticket en formato JSON");
        
        try{
            String nomArch = String.join("", pathTickets ,t.idTicket,".JSON");
            File arch = new File(nomArch);
            Gson gson = new Gson();
            String strJson = gson.toJson(t);
            System.out.println("data: " + strJson);
            FileUtils.writeStringToFile(arch, strJson, "UTF-8");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
