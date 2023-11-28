package com.cens.plataforma.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@org.springframework.transaction.annotation.Transactional(readOnly = true)
@Repository
public interface AppUserRepository extends JpaRepository<Usuario, Long>  {
    Optional<Usuario> findByEmail(String email);
}
