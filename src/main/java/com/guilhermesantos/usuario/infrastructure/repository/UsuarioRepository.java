package com.guilhermesantos.usuario.infrastructure.repository;

import com.santos.firsy_spring_app.infrastructure.enitity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

   Optional<Usuario> findByEmail(String email);

   @Transactional
    void deleteByEmail(String email);
}
