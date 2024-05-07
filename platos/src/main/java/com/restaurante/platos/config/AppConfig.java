package com.restaurante.platos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("apiIngredientes")
    public RestTemplate regTemplate(){
        return new RestTemplate();
    }
}
