package br.com.dominio.desafiocars.Repositories;


import br.com.dominio.desafiocars.Model.ModelEntityCar;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface RepositoryCar extends JpaRepository<ModelEntityCar,Long> {
}
