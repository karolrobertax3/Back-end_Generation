package com.testeUnitario.JUnit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeUnitario.JUnit.model.ContatoModel;


@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{
	public ContatoModel findFirstByNome(String nome);
	public List<ContatoModel> findAllByNomeIgnoreCaseContaining(String nome);
	public List<ContatoModel> findByNomeRetornaContato(String contato);
	public List<ContatoModel> findAllByNomeIgnoreCase(String nome);
}
