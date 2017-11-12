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
	@Table(name="butacas")	
public class Butacas {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idAvion  ;

	    @Column(name = "numeroButaca")
	    private int numeroButaca  ;

	    @Column(name = "disponibilidad")
	    private int disponibilidad  ;
	   
	    public int getIdAvion() {
	        return idAvion;
	    }

	    public void setIdAvion(int idAvion) {
	        this.idAvion = idAvion;
	    }
	    
	    public int getNumeroButaca() {
	        return numeroButaca;
	    }

	    public void setNumeroButaca(int numeroButaca) {
	        this.numeroButaca = numeroButaca;
	    }    
	    
	    public int getDisponibilidad() {
	        return disponibilidad;
	    }

	    public void setDisponibilidad(int disponibilidad) {
	        this.disponibilidad = disponibilidad;
	    }
	    	   
}
	