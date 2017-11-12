package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Destinos;

public interface DestinosService {

	Destinos findById(int id);
	
	void saveDestinos(Destinos destinos);
	
	void updateDestinos(Destinos destinos);
	
	void deleteDestinosBySsn(String ssn);

	List<Destinos> findAllDestinos(); 
	
	Destinos findDestinosBySsn(String ssn);

	boolean isDestinosSsnUnique(Integer id, String ssn);
	
}
