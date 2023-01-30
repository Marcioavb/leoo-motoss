package com.leomotoss.api.cliente.application.repository;

import java.util.List;

import com.leomotoss.api.cliente.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}