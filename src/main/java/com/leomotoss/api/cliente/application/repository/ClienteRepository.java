package com.leomotoss.api.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import com.leomotoss.api.cliente.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteComId(UUID idCliente);
}