package com.leomotoss.api.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.leomotoss.api.cliente.Sexo;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
	private Boolean aceitaTermos;
	private LocalDateTime datahoraDoCadastro;
	
	public ClienteDetalhadoResponse(UUID idCliente, String nomeCompleto, String email, String celular, String telefone,
			Sexo sexo, LocalDate dataNascimento, String cpf, Boolean aceitaTermos, LocalDateTime datahoraDoCadastro) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.aceitaTermos = aceitaTermos;
		this.datahoraDoCadastro = datahoraDoCadastro;
	}
}