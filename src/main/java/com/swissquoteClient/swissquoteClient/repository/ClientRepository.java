package com.swissquoteClient.swissquoteClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swissquoteClient.swissquoteClient.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	
	Client findByNif(Integer nif);
	void deleteById(Integer id);

}
