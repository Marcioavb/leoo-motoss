package com.leomotoss.api.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leomotoss.api.cliente.domain.Cliente;


public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

}