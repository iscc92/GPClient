package com.swissquoteClient.swissquoteClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swissquoteClient.swissquoteClient.model.Client;
import com.swissquoteClient.swissquoteClient.model.ClientRequest;
import com.swissquoteClient.swissquoteClient.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
	public Client findClientById(@PathVariable Integer id) {
		return this.clientService.findClient(id);
	}
	
	@RequestMapping(value = "/client/nif/{nif}", method = RequestMethod.GET)
	public Client findClientByNif(@PathVariable Integer nif) {
		return this.clientService.findClientbyNif(nif);
	}
	
	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public Client saveClient(@RequestBody ClientRequest clientRequest) {
		Client client = new Client(clientRequest.getName(), clientRequest.getNif());
		return this.clientService.saveClient(client);
	}
	
	@RequestMapping(value = "/client", method = RequestMethod.PUT)
	public Client updateClient(@RequestBody ClientRequest clientRequest) {
		Client client = new Client(clientRequest.getName(), clientRequest.getNif());
		return this.clientService.updateClient(client);
	}
	
	@RequestMapping(value = "/client/{ids}", method = RequestMethod.DELETE)
	public Client deleteClient(@PathVariable Integer id) {
		this.clientService.deleteClient(id);
		return null;
	}
	
}
