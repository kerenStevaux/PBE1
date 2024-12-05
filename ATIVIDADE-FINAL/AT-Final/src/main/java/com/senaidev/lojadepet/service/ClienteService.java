package com.senaidev.lojadepet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senaidev.lojadepet.controllers.Cliente;
import com.senaidev.lojadepet.repository.ClienteRepository.ClienteRepository;

@Service 
public class ClienteService {
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public List<Cliente> listartodos(){
		return clienteRepository.findAll();
		}
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	

}
