package com.smart.tech.eletronicos.telefono.telefono.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.tech.eletronicos.telefono.telefono.domain.Telefono;

public interface TelefonoJpaRepository extends JpaRepository<Telefono, UUID>{

}
