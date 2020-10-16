package com.clientes.apirest.repository;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientes.apirest.models.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
	
	Page<Cliente> findAll (Pageable pageable);

	Page<Cliente> findById (long cpf, Pageable pageable);
	
	Page<Cliente> findByNome(String nome, Pageable pageable);
	

}
	



