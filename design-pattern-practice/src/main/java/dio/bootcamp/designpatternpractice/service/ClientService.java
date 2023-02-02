package dio.bootcamp.designpatternpractice.service;

import dio.bootcamp.designpatternpractice.model.Client;
import org.springframework.stereotype.Service;

// strategy
@Service
public interface ClientService {
    Iterable<Client> findAll();

    Client findById(Long id);

    void add(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
