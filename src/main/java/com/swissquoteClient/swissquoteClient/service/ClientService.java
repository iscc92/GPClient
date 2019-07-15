package com.swissquoteClient.swissquoteClient.service;

import com.swissquoteClient.swissquoteClient.model.Client;

public interface ClientService {
	
	Client saveClient(Client client);
	Client updateClient(Client client);
	Client findClient(Integer id);
	Client findClientbyNif(Integer nif);
	Client deleteClient(Integer id);

}
