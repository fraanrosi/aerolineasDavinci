
package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Vuelos;

public interface VuelosService {

	Vuelos findById(int id);
	
	void saveVuelos(Vuelos vuelos);
	
	void updateVuelos(Vuelos vuelos);
	
	void deleteVuelosBySsn(String ssn);

	List<Vuelos> findAllVuelos(); 
	
	Vuelos findVuelosBySsn(String ssn);

	boolean isVuelosSsnUnique(Integer id, String ssn);
	
}
