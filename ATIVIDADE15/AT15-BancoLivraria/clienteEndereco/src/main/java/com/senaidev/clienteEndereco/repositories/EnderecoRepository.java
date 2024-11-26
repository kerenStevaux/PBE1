package com.senaidev.clienteEndereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.clienteEndereco.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
