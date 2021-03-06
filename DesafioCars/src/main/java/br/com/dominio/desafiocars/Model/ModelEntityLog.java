package br.com.dominio.desafiocars.Model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@DynamoDBTable(tableName = "Log")
public class ModelEntityLog {

    @Id
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private Integer id;
    private LocalDateTime data_hora;
    private String id_car;

}

