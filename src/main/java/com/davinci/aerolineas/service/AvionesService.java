package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Aviones;

public interface AvionesService {

	Aviones findById(int id);
	
	void saveAviones(Aviones aviones);
	
	void updateAviones(Aviones aviones);
	
	void deleteAvionesBySsn(String ssn);

	List<Aviones> findAllAviones(); 
	
	Aviones findAvionesBySsn(String ssn);

	boolean isAvionesSsnUnique(Integer id, String ssn);
	
}