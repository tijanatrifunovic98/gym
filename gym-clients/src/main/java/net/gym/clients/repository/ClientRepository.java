package net.gym.clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gym.clients.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
