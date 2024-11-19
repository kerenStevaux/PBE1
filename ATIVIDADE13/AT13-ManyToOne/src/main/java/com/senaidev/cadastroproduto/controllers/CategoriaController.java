package com.senaidev.cadastroproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastroproduto.entities.Categoria;
import com.senaidev.cadastroproduto.services.CategoriaService;

@RestController 
@RequestMapping("/categoria") 
public class CategoriaController  {
	@Autowired 
	private CategoriaService service;
	
	@GetMapping 
	public List<Categoria> findAll() {
		return service.findAll(); 
	
	}
	
	@PostMapping 
	public Categoria save(@RequestBody Categoria categoria) {
		return service.save(categoria);
		
	}
}