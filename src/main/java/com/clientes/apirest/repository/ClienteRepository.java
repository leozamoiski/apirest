package com.clientes.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientes.apirest.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {

	Cliente findById (long cpf);

}
	



