package br.com.dominio.desafiocars.Controller;


import br.com.dominio.desafiocars.Model.ModelEntityCar;
import br.com.dominio.desafiocars.Model.ModelEntityCars;
import br.com.dominio.desafiocars.Repositories.RepositoryCars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path="/api")
public class Controller_Cars {

@Autowired
    private RepositoryCars repositoryCars;

    @GetMapping(path="/cars")
    public List<Object> listar(){
        String uri= "http://api test.bhut.com.br:3000";
        RestTemplate restTemplate = new RestTemplate();
        Object[] listaObj = restTemplate.getForObject(uri, Object[].class);
        return Arrays.asList(listaObj);
    }

    @PostMapping(path="/cars/gravarApiExterna")
    public  void gravarLista(@RequestBody ModelEntityCars modelEntityCars){
        String uri= "http://api test.bhut.com.br:3000";
        RestTemplate restTemplate = new RestTemplate();
        ModelEntityCars lista = restTemplate.getForObject(uri,ModelEntityCars.class);
        repositoryCars.save(lista);
    }

}