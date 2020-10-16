package com.clientes.apirest.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CLIENTE")



public class Cliente implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private long id;
	private String nome;
	private long cpf;
	private int idade;
	private LocalDate data_nascimento;	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public LocalDate getNascimento() {
		return data_nascimento;
	}
	public void setNascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}	

}
