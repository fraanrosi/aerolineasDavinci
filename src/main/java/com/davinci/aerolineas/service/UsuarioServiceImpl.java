package com.davinci.aerolineas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.davinci.aerolineas.dao.UsuarioDao;
import com.davinci.aerolineas.model.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao dao;
	
	public Usuario findById(int id) {
		return dao.findById(id);
	}

	public void saveUsuario(Usuario usuario) {
		dao.saveUsuario(usuario);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	public void updateUsuario(Usuario usuario) {
		Usuario entity = dao.findById(Usuario.getId());
		if(entity!=null){
			entity.setName(usuario.getName());
			entity.setJoiningDate(usuario.getJoiningDate());
			entity.setSalary(usuario.getSalary());
			entity.setSsn(usuario.getSsn());
		}
	}

	public void deleteUsuarioBySsn(String ssn) {
		dao.deleteUsuarioBySsn(ssn);
	}
	
	public List<Usuario> findAllUsuario() {
		return dao.findAllUsuario();
	}

	public Usuario findUsuarioBySsn(String ssn) {
		return dao.findUsuarioBySsn(ssn);
	}

	public boolean isUsuarioSsnUnique(Integer id, String ssn) {
		Usuario usuario = findUsuarioBySsn(ssn);
		return ( usuario == null || ((id != null) && (usuario.getId() == id)));
	}
	
}
