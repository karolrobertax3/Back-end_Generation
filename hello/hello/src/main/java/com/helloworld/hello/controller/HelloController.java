package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Na primeira aplicação nós utilizamos a mentalidade da Persistência e habilidade de trabalho em equipe e atenção aos detalhes \nMeus objetivos de aprendizem dessa semana é me aprofundar mais em Java e Spring para desenvolver meu projeto integrador";
		
	}

}
