package com.senaidev.lojadepet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class PetRepository {
	public interface Pet extends JpaRepository<PetRepository, Long>{
		
	}

}
