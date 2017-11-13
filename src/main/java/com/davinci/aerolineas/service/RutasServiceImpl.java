package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.RutasDao;
import com.davinci.aerolineas.model.Rutas;

@Service("rutasService")
@Transactional
public class RutasServiceImpl implements RutasService {

	@Autowired
	private RutasDao dao;
	
	public Rutas findById(int id) {
		return dao.findById(id);
	}

	public void saveRutas(Rutas rutas) {
		dao.saveRutas(rutas);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateRutas(Rutas rutas) {
		Rutas entity = dao.findById(rutas.getId());
		if(entity!=null){
			entity.setName(rutas.getName());
			entity.setJoiningDate(rutas.getJoiningDate());
			entity.setSalary(rutas.getSalary());
			entity.setSsn(rutas.getSsn());
		}
	}

	public void deleteRutasBySsn(String ssn) {
		dao.deleteRutasBySsn(ssn);
	}
	
	public List<Rutas> findAllRutas() {
		return dao.findAllRutas();
	}

	public Rutas findRutasBySsn(String ssn) {
		return dao.findRutasBySsn(ssn);
	}

	public boolean isRutasSsnUnique(Integer id, String ssn) {
		Rutas Rutas = findRutasBySsn(ssn);
		return ( rutas == null || ((id != null) && (rutas.getId() == id)));
	}
	
}

