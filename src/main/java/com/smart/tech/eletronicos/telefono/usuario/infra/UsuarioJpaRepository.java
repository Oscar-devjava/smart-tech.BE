package com.smart.tech.eletronicos.telefono.usuario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.tech.eletronicos.telefono.usuario.domain.Usuario;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, UUID>{

}
