package com.senaidev.lojadepet.service;

import org.springframework.stereotype.Service;

import com.senaidev.lojadepet.repository.Cliente.ClienteRepository;

@Service 
public class Cliente {
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	

}
