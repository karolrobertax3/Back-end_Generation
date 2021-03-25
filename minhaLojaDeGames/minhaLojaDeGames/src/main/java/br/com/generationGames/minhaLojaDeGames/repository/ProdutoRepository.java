package br.com.generationGames.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generationGames.minhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	List<Produto> findAllByMarcaContainingIgnoreCase(String marca);
}
