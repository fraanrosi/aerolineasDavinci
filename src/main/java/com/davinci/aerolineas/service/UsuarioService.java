package com.davinci.aerolineas.service;

import java.util.List;

import com.davinci.aerolineas.model.Usuario;

public interface UsuarioService {

	Usuario findById(int id);
	
	void saveUsuario(Usuario usuario);
	
	void updateUsuario(Usuario usuario);
	
	void deleteUsuarioBySsn(String ssn);

	List<Usuario> findAllUsuario(); 
	
	Usuario findUsuarioBySsn(String ssn);

	boolean isUsuarioSsnUnique(Integer id, String ssn);
	
}
