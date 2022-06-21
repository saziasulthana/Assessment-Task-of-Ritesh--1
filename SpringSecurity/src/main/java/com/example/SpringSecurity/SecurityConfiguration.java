package com.example.SpringSecurity;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class SecurityConfiguration extends WebMvcConfigurerAdapter {
	
protected void Configure(Authentication auth) throws Exception{
	auth.inMemoryAuthentication()
        .withUser("a")
        .password("b")       
        .roles("User");
	
	@Bean
    public PasswordEncoder getpasswordEncoder() {
		
		return NoPasswordEncoder.getInstance();
			
		
		
		
		
	}



}
}