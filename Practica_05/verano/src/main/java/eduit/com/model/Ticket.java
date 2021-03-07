/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.com.model;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**El ticket debe tener IDTicket, FechaYhora, DatosDelVehiculo, SituacionClimatologica, LimiteVelocidadPermitido, limiteMedido./
/**
 *
 * @author Reisel
 */
@Entity
@Table(name="tickets")
public class Ticket {
    
    @Id
    @Column(name="idTicket")
    public String idTicket;
    @Column(name="fechaYhora")
    public Long fechaYhora;
    @Column(name="patente")
    public String patente;
    @Column(name="tipoVehiculo")
    public String tipoVehiculo;
    @Column(name="velocidadMedida")
    public int velocidadMedida;    
    @Column(name="SituacionClimatologica")
    public String SituacionClimatologica;
    @Column(name="limiteVelocidadPermitido")
    public Integer limiteVelocidadPermitido;
    @Column(name="limiteMedido")
    public Integer limiteMedido;
    
    public Ticket () {
    }

    public Ticket(String idTicket, Long fechaYhora, DatosVehiculo datosVehiculo, String SituacionClimatologica, Integer limiteVelocidadPermitido, Integer limiteMedido) {
        this.idTicket = idTicket;
        this.fechaYhora = fechaYhora;
        //this.datosVehiculos = datosVehiculos;
        this.patente = datosVehiculo.patente;
        this.tipoVehiculo = datosVehiculo.tipoVehiculo.name();
        this.SituacionClimatologica = SituacionClimatologica;
        this.limiteVelocidadPermitido = limiteVelocidadPermitido;
        this.limiteMedido = limiteMedido;
    }
    
    
}
