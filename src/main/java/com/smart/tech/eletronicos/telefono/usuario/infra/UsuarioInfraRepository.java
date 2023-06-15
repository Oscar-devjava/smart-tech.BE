package com.smart.tech.eletronicos.telefono.usuario.infra;

import org.springframework.stereotype.Repository;

import com.smart.tech.eletronicos.telefono.usuario.application.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
	private final UsuarioJpaRepository infraRepository;

}
