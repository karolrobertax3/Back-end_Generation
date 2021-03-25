package br.com.generationGames.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generationGames.minhaLojaDeGames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	List<Categoria> findAllByClassificacaoContainingIgnoreCase(String classificacao);
}
