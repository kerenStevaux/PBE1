package com.senaidev.lojadepet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Cliente {
	
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
		
	}

}
