package br.com.generationGames.minhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generationGames.minhaLojaDeGames.model.Categoria;
import br.com.generationGames.minhaLojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/categoria")
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getByIdCategoria(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity
						.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
		
	@GetMapping("/nome{nome}")
	public ResponseEntity<List<Categoria>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/classificacao{classificacao}")
	public ResponseEntity<List<Categoria>> getByClassificacao(@PathVariable String marca){
		return ResponseEntity.ok(repository.findAllByClassificacaoContainingIgnoreCase(marca));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@DeleteMapping
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
