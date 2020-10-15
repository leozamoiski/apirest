package com.clientes.apirest.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clientes.apirest.models.Cliente;
import com.clientes.apirest.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	
    @Autowired
	
    ClienteRepository clienteRepository;
    
/*
    public static Cliente findCpf(Long cpf) throws Exception {
    	Optional<Cliente>obj = clienteRepository.findByCpf(cpf);
    	return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! CPF: " + cpf + 
    			", Tipo"+ ClienteService.class.getName()));
    	
    }
*/

    	
    }
 
   

