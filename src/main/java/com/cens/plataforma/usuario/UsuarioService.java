package com.cens.plataforma.usuario;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public List<Usuario> getUsuarios(){
		return List.of(
			new Usuario(
				1L,
				"Uwo",
				"Herrera",
				"De los Montes",
				"uwo.qlfeo@gmail.com",
				"uwo123",
				1
			)
		);
	}
}
