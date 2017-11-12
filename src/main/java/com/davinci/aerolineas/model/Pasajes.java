package com.davinci.aerolineas.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
	
	@Entity
	@Table(name="pasajes")	
public class Pasajes {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idPasaje ;

	    @Column(name = "nombreCliente")
	    private String nombreCliente  ;

	    @Column(name = "apellidoCliente")
	    private String apellidoCliente  ;

	    @Column(name = "dniCliente")
	    private int dniCliente ;

	    @Column(name = "butaca")
	    private int butaca ;

	    @Column(name = "vuelo")
	    private int vuelo ;
	   
	    public int getIdPasaje() {
	        return idPasaje;
	    }

	    public void setIdPasaje(int idPasaje) {
	        this.idPasaje = idPasaje;
	    }
	    
	    public String getNombreCliente() {
	        return nombreCliente;
	    }

	    public void setNombreCliente(String nombreCliente) {
	        this.nombreCliente = nombreCliente;
	    }    
	    
	    public String getApellidoCliente() {
	        return apellidoCliente;
	    }

	    public void setApellidoCliente(String apellidoCliente) {
	        this.apellidoCliente = apellidoCliente;
	    }
	    
	    public int getDniCliente() {
	        return dniCliente;
	    }

	    public void setDniCliente(int dniCliente) {
	        this.dniCliente = dniCliente;
	    }
	    
	    public int getButaca() {
	        return butaca;
	    }

	    public void setButaca(int butaca) {
	        this.butaca = butaca;
	    }
	    
	    public int getVuelo() {
	        return vuelo;
	    }

	    public void setVuelo(int vuelo) {
	        this.vuelo = vuelo;
	    }
	   
}
	