package br.com.projetomvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetomvc.entity.Cliente;
import br.com.projetomvc.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public void cadastrar(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
}
