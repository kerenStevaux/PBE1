package com.senaidev.clienteEndereco.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senaidev.clienteEndereco.entities.Cliente;
import com.senaidev.clienteEndereco.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> buscarClientes() {
        return clienteService.buscarClientes();
    }
    
    @GetMapping("/id")
    public ResponseEntity<Object> buscarClientePorId(@PathVariable Long id){
    	Cliente cliente = clienteService.buscarClientesPorId(id);
    	
    	if (cliente !=null) {
    		return ResponseEntity.ok(cliente);
    	} else {
    		return ResponseEntity.status(404).body("Cliente com ID " + id +" não foi encontrado");
    	}
    }

    
    @GetMapping("/cpf/{cpf}")
    public Cliente buscarClientesPorCpf(@PathVariable String cpf) {
    	return clienteService.buscarClientePorCpf(cpf);
    }


    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente) {
        return clienteService.criarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void excluirCliente(@PathVariable Long id) {
        clienteService.excluirCliente(id);
    }
}
