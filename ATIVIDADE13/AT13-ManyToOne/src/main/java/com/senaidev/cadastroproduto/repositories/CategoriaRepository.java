package com.senaidev.cadastroproduto.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import com.senaidev.cadastroproduto.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> { }
