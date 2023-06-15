package com.smart.tech.eletronicos.telefono.administradores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrador {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	@Column(unique = true)
	private String login;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
}
