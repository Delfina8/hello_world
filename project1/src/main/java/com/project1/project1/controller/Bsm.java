package com.project1.project1.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class Bsm {
	
		@GetMapping
		public String BSM() {
			return ("Mentalidade de crescimento, Persistência, Responsabilidade pessoal, Orientação ao futuro, Comunicação, Orientação ao detalhe, Proatividade e Trabalho em equipe");
		}
		
	

}
