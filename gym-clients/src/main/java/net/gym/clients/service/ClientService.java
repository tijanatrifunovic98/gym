package net.gym.clients.service;

import java.util.List;

import net.gym.clients.entity.Client;

public interface ClientService {
	List<Client> getAllClients();
	Client saveClient (Client client);
	Client getClientById(Long id);
	Client updateClient (Client client);
	void deleteClient(Long id);
	
}
