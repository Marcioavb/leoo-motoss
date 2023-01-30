package com.leomotoss.api.cliente.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class ClienteAlteradoRequest {
	
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	@NotNull
	private boolean aceitaTermos;

}