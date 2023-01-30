package com.leomotoss.api.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import com.leomotoss.api.cliente.application.service.ClienteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");	
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");	
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");	
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");	
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteComId(UUID idCliente) {
		log.info("[inicia] ClienteController - buscaClienteComId");	
		log.info("[idCliente] {}", idCliente);	
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteComId(idCliente);
		log.info("[finaliza] ClienteController - buscaClienteComId");	
		return clienteDetalhado;
	}

	@Override
	public void deletaClienteComId(UUID idCliente) {
		log.info("[inicia] ClienteController - deletaClienteComId");	
		log.info("[idCliente] {}", idCliente);
		clienteService.deletaClienteComId(idCliente);
		log.info("[finaliza] ClienteController - deletaClienteComId");	
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
		log.info("[inicia] ClienteController - patchAlteraCliente");	
		log.info("[idCliente] {}", idCliente);
		log.info("[finaliza] ClienteController - patchAlteraCliente");	
	}
}