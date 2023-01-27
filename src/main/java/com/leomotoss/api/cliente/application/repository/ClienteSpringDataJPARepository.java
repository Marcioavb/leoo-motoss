package com.leomotoss.api.cliente.application.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leomotoss.api.cliente.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

}
