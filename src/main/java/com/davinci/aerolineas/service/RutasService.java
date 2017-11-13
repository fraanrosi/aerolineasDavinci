
package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Rutas;

public interface RutasService {

	Rutas findById(int id);
	
	void saveRutas(Rutas rutas);
	
	void updateRutas(Rutas rutas);
	
	void deleteRutasBySsn(String ssn);

	List<Rutas> findAllRutas(); 
	
	Rutas findRutasBySsn(String ssn);

	boolean isRutasSsnUnique(Integer id, String ssn);
	
}
