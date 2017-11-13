package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Pasajes;

public interface PasajesService {

	Pasajes findById(int id);
	
	void savePasajes(Pasajes pasajes);
	
	void updatePasajes(Pasajes pasajes);
	
	void deletePasajesBySsn(String ssn);

	List<Pasajes> findAllPasajes(); 
	
	Pasajes findPasajesBySsn(String ssn);

	boolean isPasajesSsnUnique(Integer id, String ssn);
	
}

