package com.shopme.admin.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain configureHttpSecurity(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers("/images/**", "/js/**", "/webjars/**").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin(form -> form
					.loginPage("/login")
					.usernameParameter("email")
					.permitAll());
		
		return http.build();
	}

}
