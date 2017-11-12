package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.DestinosDao;
import com.davinci.aerolineas.model.Destinos;

@Service("destinosService")
@Transactional
public class DestinosServiceImpl implements DestinosService {

	@Autowired
	private DestinosDao dao;
	
	public Destinos findById(int id) {
		return dao.findById(id);
	}

	public void saveDestinos(Destinos destinos) {
		dao.saveDestinos(destinos);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateDestinos(Destinos destinos) {
		Destinos entity = dao.findById(destinos.getId());
		if(entity!=null){
			entity.setName(destinos.getName());
			entity.setJoiningDate(destinos.getJoiningDate());
			entity.setSalary(destinos.getSalary());
			entity.setSsn(destinos.getSsn());
		}
	}

	public void deleteDestinosBySsn(String ssn) {
		dao.deleteDestinosBySsn(ssn);
	}
	
	public List<Destinos> findAllDestinos() {
		return dao.findAllDestinos();
	}

	public Destinos findDestinosBySsn(String ssn) {
		return dao.findDestinosBySsn(ssn);
	}

	public boolean isDestinosSsnUnique(Integer id, String ssn) {
		Destinos destinos = findDestinosBySsn(ssn);
		return ( destinos == null || ((id != null) && (destinos.getId() == id)));
	}
	
}
