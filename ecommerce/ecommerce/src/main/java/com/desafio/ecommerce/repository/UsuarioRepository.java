package com.desafio.ecommerce.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.ecommerce.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);
	public List<Usuario> findByUsuarioContainingIgnoreCase(String usuario);
	
}
