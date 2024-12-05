package com.senaidev.lojadepet.service;

import org.springframework.stereotype.Service;

import java.util.List;

public class Pet {

	@Service
	public class ProdutoService {
	    private final Pet produtoRepository;

	    public ProdutoService(Pet petRepository) {
	        this.petRepository = petRepository;
	    }

	    public List<Pet> listarTodos() {
	        return petRepository.findAll();
	    }

	    public Pet salvar(Pet pet) {
	        return produtoRepository.save(pet);
	    }
	}


}
