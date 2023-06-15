package com.smart.tech.eletronicos.telefono.telefono.application.service;

import org.springframework.stereotype.Service;

import com.smart.tech.eletronicos.telefono.telefono.application.repository.TelefonoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class TelefonoApplicationService implements TelefonoService {
	private final TelefonoRepository repository;
}
