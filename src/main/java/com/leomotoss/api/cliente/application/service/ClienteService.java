package com.leomotoss.api.cliente.application.service;

import java.util.List;
import java.util.UUID;

import com.leomotoss.api.cliente.application.api.ClienteAlteradoRequest;
import com.leomotoss.api.cliente.application.api.ClienteDetalhadoResponse;
import com.leomotoss.api.cliente.application.api.ClienteListResponse;
import com.leomotoss.api.cliente.application.api.ClienteRequest;
import com.leomotoss.api.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteComId(UUID idCliente);
	void deletaClienteComId(UUID idCliente);
	void alteraCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest);
}