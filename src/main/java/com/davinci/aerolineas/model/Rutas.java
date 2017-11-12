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
	@Table(name="rutas")	
public class Rutas {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idRuta;

	    @Column(name = "destinoLlegada")
	    private String destinoLlegada;


	    @Column(name = "destinoInicio")
	    private String destinoInicio ;


	   
	    public int getIdRuta() {
	        return idRuta;
	    }

	    public void setIdRuta(int idRuta) {
	        this.idRuta = idRuta;
	    }

	    public String getDestinoLlegada() {
	        return destinoLlegada;
	    }

	    public void setDestinoLlegada(String destinoLlegada) {
	        this.marca = destinoLlegada;
	    }

	    public String getDestinoInicio() {
	        return destinoInicio;
	    }

	    public void setDestinoInicio(String destinoInicio) {
	        this.destinoInicio = destinoInicio;
	    }
	   
}


