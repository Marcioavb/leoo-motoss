package com.leomotoss.api.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.leomotoss.api.cliente.application.api.ClienteDetalhadoResponse;
import com.leomotoss.api.cliente.application.api.ClienteListResponse;
import com.leomotoss.api.cliente.application.api.ClienteRequest;
import com.leomotoss.api.cliente.application.api.ClienteResponse;
import com.leomotoss.api.cliente.application.repository.ClienteRepository;
import com.leomotoss.api.cliente.domain.Cliente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicastionService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicastionService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicastionService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicastionService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteComId(UUID idCliente) {
		log.info("[inicia] ClienteApplicastionService - buscaClienteComId");
		Cliente cliente = clienteRepository.buscaClienteComId(idCliente);
		log.info("[finaliza] ClienteApplicastionService - buscaClienteComId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClienteComId(UUID idCliente) {
		log.info("[inicia] ClienteApplicastionService - deletaClienteComId");
		Cliente cliente = clienteRepository.buscaClienteComId(idCliente);
		clienteRepository.deletaClienteComId(cliente);
		log.info("[finaliza] ClienteApplicastionService - deletaClienteComId");
	}
}