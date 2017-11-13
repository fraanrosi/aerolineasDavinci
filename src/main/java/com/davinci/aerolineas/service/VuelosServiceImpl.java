package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.VuelosDao;
import com.davinci.aerolineas.model.Vuelos;

@Service("vuelosService")
@Transactional
public class VuelosServiceImpl implements VuelosService {

	@Autowired
	private VuelosDao dao;
	
	public Vuelos findById(int id) {
		return dao.findById(id);
	}

	public void saveVuelos(Vuelos vuelos) {
		dao.saveVuelos(vuelos);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateVuelos(Vuelos vuelos) {
		Vuelos entity = dao.findById(vuelos.getId());
		if(entity!=null){
			entity.setName(vuelos.getName());
			entity.setJoiningDate(vuelos.getJoiningDate());
			entity.setSalary(vuelos.getSalary());
			entity.setSsn(vuelos.getSsn());
		}
	}

	public void deleteVuelosBySsn(String ssn) {
		dao.deleteVuelosBySsn(ssn);
	}
	
	public List<Vuelos> findAllVuelos() {
		return dao.findAllVuelos();
	}

	public Vuelos findVuelosBySsn(String ssn) {
		return dao.findVuelosBySsn(ssn);
	}

	public boolean isVuelosSsnUnique(Integer id, String ssn) {
		Vuelos vuelos = findVuelosBySsn(ssn);
		return ( vuelos == null || ((id != null) && (vuelos.getId() == id)));
	}
	
}

