package com.smart.tech.eletronicos.telefono.telefono.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Telefono {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID",name = "idTelefono", nullable = false,updatable = false,unique = true)
	private UUID idTelefono;
	private String nombre;
	private Marca marca;
	private String lancamiento;
	private String fichaTecnica;
	private String descripcion;
	private int precio;
	private LocalDateTime dataCadastro;
	
	

}
