package com.smart.tech.eletronicos.telefono.telefono.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.smart.tech.eletronicos.telefono.telefono.application.service.TelefonoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class TelefonoRestController implements TelefonoAPI {
	private final TelefonoService service;
}
