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
	@Table(name="vuelos")	
public class Vuelos {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idVuelo;

	    @Column(name = "idAvion")
	    private int idAvion ;

	    @Column(name = "idRuta")
	    private int idRuta ;

	    @Column(name = "costoVuelo")
	    private double costoVuelo   ;


	   
	    public int getIdVuelo() {
	        return idVuelo;
	    }

	    public void setIdVuelo(int idVuelo) {
	        this.idVuelo = idVuelo;
	    }
	    
	    public String getIdAvion() {
	        return idAvion;
	    }

	    public void setIdAvion(String idAvion) {
	        this.idAvion = idAvion;
	    }    
	    
	    public int getIdRuta() {
	        return idRuta;
	    }

	    public void setIdRuta(int idRuta) {
	        this.idRuta = idRuta;
	    }

	    
	   
}


