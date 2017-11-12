package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.AvionesDao;
import com.davinci.aerolineas.model.Aviones;

@Service("avionesService")
@Transactional
public class AvionesServiceImpl implements AvionesService {

	@Autowired
	private AvionesDao dao;
	
	public Aviones findById(int id) {
		return dao.findById(id);
	}

	public void saveAviones(Aviones aviones) {
		dao.saveAviones(aviones);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateAviones(Aviones aviones) {
		Aviones entity = dao.findById(aviones.getId());
		if(entity!=null){
			entity.setName(aviones.getName());
			entity.setJoiningDate(aviones.getJoiningDate());
			entity.setSalary(aviones.getSalary());
			entity.setSsn(aviones.getSsn());
		}
	}

	public void deleteAvionesBySsn(String ssn) {
		dao.deleteAvionesBySsn(ssn);
	}
	
	public List<Aviones> findAllAviones() {
		return dao.findAllAviones();
	}

	public Aviones findAvionesBySsn(String ssn) {
		return dao.findAvionesBySsn(ssn);
	}

	public boolean isAvionesSsnUnique(Integer id, String ssn) {
		Aviones aviones = findAvionesBySsn(ssn);
		return ( aviones == null || ((id != null) && (aviones.getId() == id)));
	}
	
}
