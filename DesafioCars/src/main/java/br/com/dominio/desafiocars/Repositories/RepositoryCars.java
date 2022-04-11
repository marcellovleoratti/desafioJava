package br.com.dominio.desafiocars.Repositories;

import br.com.dominio.desafiocars.Model.ModelEntityCars;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableScan
@Repository
public interface RepositoryCars extends JpaRepository<ModelEntityCars,Long> {

    List<String> saveByTemplete(Object obj);
}
