package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return " hello world, bom dia!";
	}

	@GetMapping("/t47")
	public String turma47() {
		return " hello turma 47!";
	}

	@GetMapping("/BSMs")
	public String Bsms() {
		return " Orientação ao futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência, Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação!";
	}

	@GetMapping("/Objetivos da Semana")
	public String objetivosDaSemana() {
		return " Aprender mais sobre Springboot, aprender iniciar o CRUD!";
	}
}
