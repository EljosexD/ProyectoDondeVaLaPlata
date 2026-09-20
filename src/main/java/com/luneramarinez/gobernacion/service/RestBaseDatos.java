package com.luneramarinez.gobernacion.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.luneramarinez.gobernacion.dto.ContratosElectronicosDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController 
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RestBaseDatos {

    
    private final RestTemplate restTemplate;
    private final String socrataToken;
    
    public RestBaseDatos(RestTemplate restTemplate, String socrataToken) {
        this.restTemplate = restTemplate;
        this.socrataToken = socrataToken;
    }
    private ContratosElectronicosDTO[] getApi(){
        String url = "https://www.datos.gov.co/api/v3/views/jbjy-vk9h/query.json?pageNumber=1&pageSize=50&app_token="+ socrataToken;
        return restTemplate.getForObject(url, ContratosElectronicosDTO[].class);
    }

    @GetMapping("/dashboard")
    public List<ContratosElectronicosDTO> obtenerRestaurantes(){
        ContratosElectronicosDTO[] listaContractos = getApi();
        return Arrays.asList(listaContractos); 
    }
    
}
