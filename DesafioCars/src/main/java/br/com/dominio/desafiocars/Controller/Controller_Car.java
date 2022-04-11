package br.com.dominio.desafiocars.Controller;


import br.com.dominio.desafiocars.Model.ModelEntityCar;
import br.com.dominio.desafiocars.Model.ModelEntityLog;
import br.com.dominio.desafiocars.Repositories.RepositoryCar;
import br.com.dominio.desafiocars.Repositories.RepositoryLog;
import org.hibernate.collection.internal.PersistentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping(path="/api")
public class Controller_Car {

    @Autowired
    private RepositoryCar repositoryCar;

    @Autowired
    private RepositoryLog repositoryLog;

    @PostMapping(path = "/createCar")
    public void gravarLog(@RequestBody ModelEntityLog modelEntityLog){
        repositoryLog.save(modelEntityLog);

    }

    @PostMapping(path="/ListarCar")
    public Set<ModelEntityCar> gravarCar(@RequestBody ModelEntityCar modelEntityCar){
        repositoryCar.save(modelEntityCar);
        Set<ModelEntityCar> fila = new HashSet<ModelEntityCar>();
        fila.add(modelEntityCar);
        return fila;
    }

}

