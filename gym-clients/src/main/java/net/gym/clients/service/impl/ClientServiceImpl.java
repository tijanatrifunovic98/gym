package net.gym.clients.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.gym.clients.entity.Client;
import net.gym.clients.repository.ClientRepository;
import net.gym.clients.service.ClientService;


@Service
public class ClientServiceImpl implements ClientService {

	private ClientRepository clientRepository;
	
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}


	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}


	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}


	@Override
	public Client getClientById(Long id) {
		return clientRepository.findById(id).get();
	}


	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}


	@Override
	public void deleteClient(Long id) {
	 clientRepository.deleteById(id);
	}
	
}
