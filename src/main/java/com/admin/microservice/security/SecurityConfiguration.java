package com.admin.microservice.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import com.admin.microservice.jwt.JwtFilter;

@Component
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfiguration {
	
	@Autowired
	AdminLoginDetailsService adminLoginDetailsService;
	
	@Autowired
	JwtFilter filter;
	
	
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(adminLoginDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	
	@Bean
    SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
        
        http.csrf().disable().cors().disable().authorizeHttpRequests()
        .requestMatchers("/api/v1/admin/authenticate")
        .permitAll()
        .requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
        .anyRequest().authenticated()
        .and().sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
        
        
        
    }
    
    
    @Bean
    AuthenticationManager authmanager(AuthenticationConfiguration config) throws Exception {
        
        return config.getAuthenticationManager();
    }

}
