package com.clientes.apirest.repository;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientes.apirest.models.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
	
	Page<Cliente> findAll (Pageable pageable);

	Page<Cliente> findById (long id, Pageable pageable);
	
	Page<Cliente> findByNomeIgnoreCase(String nome, Pageable pageable);
	
	Page<Cliente> findByCpf(long cpf, Pageable pageable);
	

}
	



