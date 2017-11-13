package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.PasajesDao;
import com.davinci.aerolineas.model.Pasajes;

@Service("pasajesService")
@Transactional
public class PasajesServiceImpl implements PasajesService {

	@Autowired
	private PasajesDao dao;
	
	public Pasajes findById(int id) {
		return dao.findById(id);
	}

	public void savePasajes(Pasajes pasajes) {
		dao.savePasajes(pasajes);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updatePasajes(Pasajes pasajes) {
		Pasajes entity = dao.findById(pasajes.getId());
		if(entity!=null){
			entity.setName(pasajes.getName());
			entity.setJoiningDate(pasajes.getJoiningDate());
			entity.setSalary(pasajes.getSalary());
			entity.setSsn(pasajes.getSsn());
		}
	}

	public void deletePasajesBySsn(String ssn) {
		dao.deletePasajesBySsn(ssn);
	}
	
	public List<Pasajes> findAllPasajes() {
		return dao.findAllPasajes();
	}

	public Pasajes findPasajesBySsn(String ssn) {
		return dao.findPasajesBySsn(ssn);
	}

	public boolean isPasajesSsnUnique(Integer id, String ssn) {
		Pasajes pasajes = findPasajesBySsn(ssn);
		return ( pasajes == null || ((id != null) && (pasajes.getId() == id)));
	}
	
}

