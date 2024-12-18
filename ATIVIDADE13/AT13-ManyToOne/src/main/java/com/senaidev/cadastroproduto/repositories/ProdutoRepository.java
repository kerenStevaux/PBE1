package com.senaidev.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.cadastroproduto.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> { }
