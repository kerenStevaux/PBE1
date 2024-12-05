package com.senaidev.lojadepet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository {
	
public interface Cliente extends JpaRepository<ClienteRepository, Long>{
		
	}

}
