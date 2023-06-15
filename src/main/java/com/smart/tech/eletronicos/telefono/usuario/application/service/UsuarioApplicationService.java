package com.smart.tech.eletronicos.telefono.usuario.application.service;

import org.springframework.stereotype.Service;

import com.smart.tech.eletronicos.telefono.usuario.application.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
	private final UsuarioRepository repository;

}
