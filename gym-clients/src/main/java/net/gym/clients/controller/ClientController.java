package net.gym.clients.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.gym.clients.entity.Client;
import net.gym.clients.service.ClientService;

@Controller
public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	@GetMapping("/clients")
	public String listClients(Model model) {
		model.addAttribute("clients", clientService.getAllClients());
		return "clients";
		
	}
	
	@GetMapping("/clients/new")
	public String createClientForm(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "create_client";
				
	}
	
	@PostMapping("/clients")
	public String saveStudent (@ModelAttribute ("client") Client client) {
		clientService.saveClient(client);
		return "redirect:/clients";
		
		
	}
	
	@GetMapping("/clients/edit{id}")
	public String editClientForm(@PathVariable Long id, Model model) {
		model.addAttribute("client", clientService.getClientById(id));
		return "edit_client";
		
		
	}
	
	@PostMapping("/clients/{id}")
	public String updateClient (@PathVariable Long id,@ModelAttribute("client") Client client, Model model) {
		Client existingClient =clientService.getClientById(id);
		existingClient.setId(client.getId());
		existingClient.setFirstName(client.getFirstName());
		existingClient.setLastName(client.getLastName());
		existingClient.setEmail(client.getEmail());
		
		clientService.updateClient(existingClient);
		return "redirect:/clients";

		
	}
	
	@GetMapping("/clients/{id}")
	public String deleteClient (@PathVariable Long id) {
		clientService.deleteClient(id);
		return "redirect:/clients";
		
	}
}
