package dio.bootcamp.designpatternpractice.model.repository;

import dio.bootcamp.designpatternpractice.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
