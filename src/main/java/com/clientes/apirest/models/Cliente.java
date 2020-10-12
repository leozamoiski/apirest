package com.clientes.apirest.models;

import java.io.Serializable;

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
	@GeneratedValue (strategy=GenerationType.AUTO)
	
	private long id;
	private String nome;
	private double idade;
	private long cpf;
	private long data_nascimento;
	
	
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
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(long data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	

}
