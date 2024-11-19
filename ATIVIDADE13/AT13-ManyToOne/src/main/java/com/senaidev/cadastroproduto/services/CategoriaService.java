package com.senaidev.cadastroproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastroproduto.entities.Categoria;
import com.senaidev.cadastroproduto.repositories.CategoriaRepository;

@Service 
public class CategoriaService {
	
	@Autowired 
	private CategoriaRepository repository; 
	public List<Categoria> findAll() { 
		return repository.findAll(); 
		
	}
	
	public Categoria save(Categoria categoria) { 
		return repository.save(categoria); 
		
	}
}