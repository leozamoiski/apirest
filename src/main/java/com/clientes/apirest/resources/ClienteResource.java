package com.clientes.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.clientes.apirest.repository.ClienteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import com.clientes.apirest.models.Cliente;

@RestController
@RequestMapping("/api")
@Api(value="API REST")
@CrossOrigin(origins="*")
public class ClienteResource {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping ("/cliente")
	@ApiOperation(value="Retorna Cliente")
	public Page<Cliente> listaCliente(Pageable pageable){
		return clienteRepository.findAll(pageable);
	}
	
	/* Busca por id. */	
	@GetMapping ("/cliente/{id}")
	@ApiOperation(value="Busca por id")
	public Page<Cliente> listaClienteUnico(@PathVariable(value="id")long id, Pageable pageable){
		return clienteRepository.findById(id, pageable);
	}
	
    @GetMapping
    @ApiOperation(value="Busca por Nome")
    public Page<Cliente> findCustomersByNome(
                               @RequestParam("nome") String nome,
                               Pageable pageable) {
 
        if (nome == null) {
            return clienteRepository.findAll(pageable);
        } else {
            return clienteRepository.findByNome(nome, pageable);
        }
    }
	
	@PostMapping("/cliente")
	@ApiOperation(value="Salva Cliente")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta Cliente")
	public void deletaCliente (@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza Cliente")
	public Cliente atualizaCliente (@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
	

