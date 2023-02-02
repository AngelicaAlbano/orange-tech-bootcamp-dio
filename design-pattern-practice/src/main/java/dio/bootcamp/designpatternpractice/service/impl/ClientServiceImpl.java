package dio.bootcamp.designpatternpractice.service.impl;

import dio.bootcamp.designpatternpractice.model.Client;
import dio.bootcamp.designpatternpractice.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Iterable<Client> findAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public void add(Client client) {

    }

    @Override
    public void update(Long id, Client client) {

    }

    @Override
    public void delete(Long id) {

    }
}
