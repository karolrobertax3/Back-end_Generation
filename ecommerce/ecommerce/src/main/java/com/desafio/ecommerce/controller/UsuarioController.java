package com.desafio.ecommerce.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.ecommerce.model.Usuario;
import com.desafio.ecommerce.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	@Autowired
	public UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<List<Usuario>> getByName(@PathVariable String nome ){
		return ResponseEntity.ok(repository.findByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> postCadastro(@RequestBody Usuario novoUsuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(novoUsuario));
	}
	
	
	
}
