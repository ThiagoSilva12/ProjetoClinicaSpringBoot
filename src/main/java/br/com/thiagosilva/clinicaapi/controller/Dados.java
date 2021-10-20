package br.com.thiagosilva.clinicaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiagosilva.clinicaapi.model.Cliente;
/*
 * em nosso projeto iremos utilizar algumas anotações(Annotation)que
 * são elementos de tipicação de código, ou seja, são aplicações que
 * fazemos no códiugo para informar o que aquela linha ou grupo de comando
 * deve fazer e como deve ser entendido.
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador
 * de fluxo que receberá comandos em Rest e responderá dados no formato
 * Rest.
 */
@RestController
@RequestMapping("/")
public class Dados {

	@GetMapping
public String inicial() {
	return "Olá você está na página inicial do projeto";
}
	
	@GetMapping("/cliente")
	public String cliente() {
		return "Thiago Silva";
	}
	@GetMapping("/clientes")
	public List<Cliente> clientes() {
		List<Cliente> lst = new ArrayList<Cliente>();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setNome("Wagner");
		c2.setNome("Vanessa");
		
		lst.add(c1);
		lst.add(c2);
		
		return lst;
	}
	
	@PostMapping("/cadastro")
	public String cadastro() {
		return "Cadastro realizado";
	}
	@PutMapping("/atualizar")
	public String atualizar() {
		return "Dados atualizados";
	}
	@DeleteMapping("/apagar")
	public String apagar() {
		return "Dados apagados";
	}
	
	
}
