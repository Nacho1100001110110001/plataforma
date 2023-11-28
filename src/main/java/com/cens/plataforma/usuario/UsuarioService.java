package com.cens.plataforma.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService{
	private final AppUserRepository appUserRepository;
	private final static String USUARIO_NO_ENCONTRADO ="Usuario con el email %s no fue encontrado";

	@Autowired
    public UsuarioService(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
			return appUserRepository.findByEmail(email)
					.orElseThrow(() ->
							new UsernameNotFoundException(
									String.format(USUARIO_NO_ENCONTRADO, email)));
	}


	public List<Usuario> getUsuarios(){
		return appUserRepository.findAll();
	}
	
	
	
}