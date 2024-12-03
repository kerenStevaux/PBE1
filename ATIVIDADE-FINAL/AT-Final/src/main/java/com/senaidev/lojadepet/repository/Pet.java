package com.senaidev.lojadepet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class Pet {
	public interface PetRepository extends JpaRepository<Pet, Long>{
		
	}

}
