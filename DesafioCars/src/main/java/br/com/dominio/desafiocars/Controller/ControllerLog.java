package br.com.dominio.desafiocars.Controller;


import br.com.dominio.desafiocars.Model.ModelEntityLog;
import br.com.dominio.desafiocars.Repositories.RepositoryCar;
import br.com.dominio.desafiocars.Repositories.RepositoryLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class ControllerLog {

    @Autowired
    private RepositoryLog repositoryLog;


    @GetMapping(path="/logs/{id}")
    public List<ModelEntityLog> listarLog(@PathVariable String id){
        return repositoryLog.findByLog(id);
    }


}
