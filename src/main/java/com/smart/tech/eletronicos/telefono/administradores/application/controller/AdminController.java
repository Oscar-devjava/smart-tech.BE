package com.smart.tech.eletronicos.telefono.administradores.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.tech.eletronicos.telefono.administradores.application.repository.AdminRepository;
import com.smart.tech.eletronicos.telefono.administradores.model.Administrador;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/admin")
@RequiredArgsConstructor
public class AdminController {
	private final AdminRepository repository;
	private final PasswordEncoder encoder;

	@PostMapping("/cadastro")
	public ResponseEntity<Administrador> salvar( @RequestBody @Valid Administrador admin) {
		admin.setPassword(encoder.encode(admin.getPassword()));
		return ResponseEntity.ok(repository.save(admin));
	}
	
	@GetMapping("/lista")
	public ResponseEntity<List<Administrador>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@DeleteMapping("/{id}")
	public  void deletar(@PathVariable Long id) {
		 repository.deleteById(id);
	}
}
