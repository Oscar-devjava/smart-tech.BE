package com.smart.tech.eletronicos.telefono.usuario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuario")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID",name = "idUsuario", nullable = false,updatable = false,unique = true)
	private UUID idUsuario;
	@NotBlank
	private String nombre;
	@NotBlank
	private String Apellido;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String telefono;
	@CPF
	@NotBlank
	private String cpf;
	@NotNull
	private LocalDate dataNascimiento;
	private LocalDateTime dataHoraDelCadastro;
	private LocalDateTime dataHoraUltimaActualizacion;
	
	
}
