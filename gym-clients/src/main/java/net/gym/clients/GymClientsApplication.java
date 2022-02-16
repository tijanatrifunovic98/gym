package net.gym.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.gym.clients.entity.Client;
import net.gym.clients.repository.ClientRepository;

@SpringBootApplication
public class GymClientsApplication implements CommandLineRunner  {

	public static void main(String[] args){
		SpringApplication.run(GymClientsApplication.class, args);
	}

	@Autowired
	private ClientRepository clientRepository;
	@Override
	public void run(String... args) throws Exception {
//		Client client1= new Client("Tijana", "Trifunovic", "tijana@gmail.com");
//		clientRepository.save(client1);
//		Client client2= new Client("Tamara", "Skaric", "tamara@gmail.com");
//		clientRepository.save(client2);
//		Client client3= new Client("Elena", "Tosic", "elena@gmail.com");
//		clientRepository.save(client3);
	}

}
