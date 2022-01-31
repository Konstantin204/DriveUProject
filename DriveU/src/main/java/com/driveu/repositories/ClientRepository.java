package com.driveu.repositories;

import com.driveu.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findClientByUsername(String Username);
    Optional<Client> findClientByUsernameAndPassword(String Username, String Password);
}
