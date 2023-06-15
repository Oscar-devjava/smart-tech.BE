package com.smart.tech.eletronicos.telefono.telefono.infra;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.smart.tech.eletronicos.telefono.telefono.application.api.TelefonoRestController;
import com.smart.tech.eletronicos.telefono.telefono.application.repository.TelefonoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class TelefonoInfraRepository implements TelefonoRepository {
	private final TelefonoJpaRepository jpaRepository;
}
