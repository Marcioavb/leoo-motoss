package com.leomotoss.api.cliente.application.service;

import org.springframework.stereotype.Service;

import com.leomotoss.api.cliente.Cliente;
import com.leomotoss.api.cliente.application.api.ClienteRequest;
import com.leomotoss.api.cliente.application.api.ClienteResponse;
import com.leomotoss.api.cliente.application.repository.ClienteRepository;

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
}