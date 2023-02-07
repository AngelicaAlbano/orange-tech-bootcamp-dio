package dio.bootcamp.designpatternpractice.service.impl;

import dio.bootcamp.designpatternpractice.model.Address;
import dio.bootcamp.designpatternpractice.model.AddressRepository;
import dio.bootcamp.designpatternpractice.model.Client;
import dio.bootcamp.designpatternpractice.model.ClientRepository;
import dio.bootcamp.designpatternpractice.service.ClientService;
import dio.bootcamp.designpatternpractice.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

  // Singleton: Inject Sprign @Autowired components

  @Autowired private ClientRepository clientRepository;
  @Autowired private AddressRepository addressRepository;
  @Autowired private ViaCepService cepService;

  // Strategy: Implement methods declared by ClientService interface
  // Facade: Abstract integrations with systems, providing a simple interface

  @Override
  public Iterable<Client> findAll() {
    return clientRepository.findAll();
  }

  @Override
  public Client findById(Long id) {
    Optional<Client> client = clientRepository.findById(id);
    return client.get();
  }

  @Override
  public void add(Client client) {
    saveClientWithCep(client);
  }

  @Override
  public void update(Long id, Client client) {
    Optional<Client> clientDb = clientRepository.findById(client.getId());
    if (clientDb.isPresent()) {
      saveClientWithCep(client);
    }
  }

  @Override
  public void delete(Long id) {
    clientRepository.deleteById(id);
  }

  private void saveClientWithCep(Client client) {
    String cep = client.getAddress().getCep();
    Address address =
        addressRepository
            .findById(cep)
            .orElseGet(
                () -> {
                  Address newAdress = cepService.consultarCep(cep);
                  addressRepository.save(newAdress);
                  return newAdress;
                });
    client.setAddress(address);
    clientRepository.save(client);
  }
}
