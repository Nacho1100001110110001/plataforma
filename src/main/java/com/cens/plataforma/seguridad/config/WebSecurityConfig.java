package com.cens.plataforma.seguridad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.cens.plataforma.usuario.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    private final UsuarioService usuarioService;   
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public WebSecurityConfig(UsuarioService usuarioService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usuarioService = usuarioService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //COMENTARIO IMPORTANTE!!! la primera parte de este metodo lo obtuve de interner, por ende hay que revisarlo bien
		http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form
				.loginPage("/login")
				.permitAll()
			)
			.logout((logout) -> logout.permitAll());

		return http.build();
	}
    //Esto de aca deberia funcionar
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider user= new DaoAuthenticationProvider();
        user.setPasswordEncoder(bCryptPasswordEncoder);
        user.setUserDetailsService(usuarioService);
        return user;
	}
}
