package com.luneramarinez.gobernacion.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration 
public class Appconfig {
    @Value 
    ("${socrata.app.token}")
    private String appToken;
    
    @Bean
    public String socrataToken() {
        return this.appToken;
    }
    @Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
