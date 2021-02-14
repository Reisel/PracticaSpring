/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.model;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

/**El ticket debe tener IDTicket, FechaYhora, DatosDelVehiculo, SituacionClimatologica, LimiteVelocidadPermitido, limiteMedido./
/**
 *
 * @author Reisel
 */
public class Ticket {
    
    public String idTicket;
    public Long fechaYhora;
    public DatosVehiculo datosVehiculos;
    public String SituacionClimatologica;
    public Integer limiteVelocidadPermitido;
    public Integer limiteMedido;
    
    public Ticket () {
    }

    public Ticket(String idTicket, Long fechaYhora, DatosVehiculo datosVehiculos, String SituacionClimatologica, Integer limiteVelocidadPermitido, Integer limiteMedido) {
        this.idTicket = idTicket;
        this.fechaYhora = fechaYhora;
        this.datosVehiculos = datosVehiculos;
        this.SituacionClimatologica = SituacionClimatologica;
        this.limiteVelocidadPermitido = limiteVelocidadPermitido;
        this.limiteMedido = limiteMedido;
    }
    
    
}
