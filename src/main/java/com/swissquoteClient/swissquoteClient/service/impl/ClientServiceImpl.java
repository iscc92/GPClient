package com.swissquoteClient.swissquoteClient.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swissquoteClient.swissquoteClient.model.Client;
import com.swissquoteClient.swissquoteClient.repository.ClientRepository;
import com.swissquoteClient.swissquoteClient.service.ClientService;


@Service 
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client saveClient(Client client) {
		return this.clientRepository.saveAndFlush(client);
	}

	@Override
	public Client updateClient(Client client) {
		
		Client resultClient = this.clientRepository.findByNif(client.getNif());
		
		if (resultClient != null) {
			resultClient.setName(client.getName());
			this.clientRepository.saveAndFlush(resultClient);
		
		} else {
		resultClient = null;
		}
		
		return resultClient;
	}

	@Override
	public Client findClient(Integer id) {
		return this.clientRepository.findById(id).get();
	}

	@Override
	public Client findClientbyNif(Integer nif) {
		return this.clientRepository.findByNif(nif);
	}

	@Override
	public Client deleteClient(Integer id) {
		this.clientRepository.deleteById(id);
		return null;
	}

}
