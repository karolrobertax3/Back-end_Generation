package com.desafio.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.ecommerce.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {
	public List<Loja> findByNomeLojaContainingIgnoreCase(String nome);
	public List<Loja> findByDescricaoContainingIgnoreCase(String descricao);

}
