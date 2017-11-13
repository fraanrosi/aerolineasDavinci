package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.ButacasDao;
import com.davinci.aerolineas.model.Butacas;

@Service("butacasService")
@Transactional
public class ButacasServiceImpl implements ButacasService {

	@Autowired
	private ButacasDao dao;
	
	public Butacas findById(int id) {
		return dao.findById(id);
	}

	public void saveButacas(Butacas butacas) {
		dao.saveButacas(butacas);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateButacas(Butacas butacas) {
		Butacas entity = dao.findById(butacas.getId());
		if(entity!=null){
			entity.setName(butacas.getName());
			entity.setJoiningDate(butacas.getJoiningDate());
			entity.setSalary(butacas.getSalary());
			entity.setSsn(butacas.getSsn());
		}
	}

	public void deleteButacasBySsn(String ssn) {
		dao.deleteButacasBySsn(ssn);
	}
	
	public List<Butacas> findAllButacas() {
		return dao.findAllButacas();
	}

	public Butacas findButacasBySsn(String ssn) {
		return dao.findButacasBySsn(ssn);
	}

	public boolean isButacasSsnUnique(Integer id, String ssn) {
		Butacas butacas = findButacasBySsn(ssn);
		return ( butacas == null || ((id != null) && (butacas.getId() == id)));
	}
	
}
