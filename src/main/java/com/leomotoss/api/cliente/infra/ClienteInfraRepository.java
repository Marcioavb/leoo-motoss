package com.leomotoss.api.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.leomotoss.api.cliente.application.repository.ClienteRepository;
import com.leomotoss.api.cliente.domain.Cliente;
import com.leomotoss.api.handler.APIException;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva ");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva ");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[ininia] ClienteInfraRepository -  buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository -  buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteComId(UUID idCliente) {
		log.info("[ininia] ClienteInfraRepository -  buscaClienteComId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente nao encontardo!"));
		log.info("[ininia] ClienteInfraRepository -  buscaClienteComId");
		return cliente;
	}

	@Override
	public void deletaClienteComId(Cliente cliente) {
		log.info("[ininia] ClienteInfraRepository -  deletaClienteComId");
		clienteSpringDataJPARepository.delete(cliente);
		log.info("[finaliza] ClienteInfraRepository -  deletaClienteComId");
	}
}