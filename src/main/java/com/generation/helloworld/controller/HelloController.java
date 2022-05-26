package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloworld() {
		return "Hello Turma 53!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Atenção aos Detalhes <br /> Trabalho em Equipe <br /> Mentalidade de Crescimento <br /> Persistencia <br /> Responsabilidade pessoal <br /> Orientacão ao Futuro " ;
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender <br /> Msql <br /> SpringBoot <br/> ter a base do Projeto integrador <br /> ter a base do blog pessoal";
	}
}