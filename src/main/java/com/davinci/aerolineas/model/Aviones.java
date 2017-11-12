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
	@Table(name="aviones")	
public class Aviones {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idAvion;

	    @Column(name = "marca")
	    private String marca;


	    @Column(name = "modelo")
	    private String modelo;


	    @Column(name = "matricula")
	    private String matricula;

	    @Column(name = "cantidadButacas")
	    private int cantidadButacas;
	     
	    public int getIdAvion() {
	        return idAvion;
	    }

	    public void setIdAvion(int idAvion) {
	        this.idAvion = idAvion;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }
	    public int getCantidadButacas() {
	        return cantidadButacas;
	    }

	    public void setCantidadButacas(int cantidadButacas) {
	        this.cantidadButacas = cantidadButacas;
	    }
	   
}


