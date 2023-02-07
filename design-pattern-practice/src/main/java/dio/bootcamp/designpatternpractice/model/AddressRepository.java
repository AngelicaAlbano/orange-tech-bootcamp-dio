package dio.bootcamp.designpatternpractice.model;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {}
