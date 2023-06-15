package com.smart.tech.eletronicos.telefono.administradores.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.tech.eletronicos.telefono.administradores.model.Administrador;

public interface AdminRepository extends JpaRepository<Administrador, Long>{

}
