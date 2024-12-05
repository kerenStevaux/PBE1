package com.senaidev.lojadepet.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.lojadepet.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class Cliente {

	private ClienteService clienteService;
	
	public Cliente(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente criar(@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteService.listartodos();
	}
}
