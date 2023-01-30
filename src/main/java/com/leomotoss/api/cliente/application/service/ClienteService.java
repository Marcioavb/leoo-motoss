package com.leomotoss.api.cliente.application.service;

import java.util.List;

import com.leomotoss.api.cliente.application.api.ClienteListResponse;
import com.leomotoss.api.cliente.application.api.ClienteRequest;
import com.leomotoss.api.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}