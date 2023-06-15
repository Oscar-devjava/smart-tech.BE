package com.smart.tech.eletronicos.telefono.usuario.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.smart.tech.eletronicos.telefono.usuario.application.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioAPI {
	private final UsuarioService service;
}
