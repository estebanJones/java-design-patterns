package fr.diginamic.tp_grasps.services;

import org.springframework.stereotype.Service;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.daos.ClientDao;

@Service
public class ClientService {
	private ClientDao clientDao;
	
	public ClientService(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
	
	public Client getClient(String identifiantClient) {
		return clientDao.extraireClient(identifiantClient);
	}
}
