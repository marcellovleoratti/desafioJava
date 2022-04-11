package br.com.dominio.desafiocars.Repositories;

import br.com.dominio.desafiocars.Model.ModelEntityLog;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableScan
public interface RepositoryLog extends JpaRepository<ModelEntityLog,String> {

    List<ModelEntityLog> findByLog(String id);
}
