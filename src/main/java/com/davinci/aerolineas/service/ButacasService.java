package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Butacas;

public interface ButacasService {

	Butacas findById(int id);
	
	void saveButacas(Butacas butacas);
	
	void updateButacas(Butacas butacas);

	void deleteButacasBySsn(String ssn);

	List<Butacas> findAllButacas(); 
	
	Butacas findButacasBySsn(String ssn);

	boolean isButacasSsnUnique(Integer id, String ssn);
	
}

