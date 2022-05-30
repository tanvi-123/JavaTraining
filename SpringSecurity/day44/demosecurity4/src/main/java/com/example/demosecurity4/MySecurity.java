package com.example.demosecurity4;

import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public interface MySecurity extends WebSecurityConfigurerAdapter{
@Override protected void configure(AuthenticationManagerBuilder auth) throws Exception
{
	auth.inMemoryAuthentication()
	.withUser("abc")
	.password("xyz")
	.roles("USER")
	.and()
	.withUser("pp")
	.password("ss")
	.roles("admin");
}
@Bean
public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}
}
