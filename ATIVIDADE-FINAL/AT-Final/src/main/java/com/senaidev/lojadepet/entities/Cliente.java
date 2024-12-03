package com.senaidev.lojadepet.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")

public class Cliente {
	
	//Atributos
	@ManyToOne
    @JoinColumn(name = "PET_id")
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "telefone")
	private int telefone;
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
