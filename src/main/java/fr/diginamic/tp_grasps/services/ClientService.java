package fr.diginamic.tp_grasps.services;

import org.springframework.stereotype.Service;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.daos.IClientDao;

@Service
public class ClientService {
	private IClientDao clientDao;
	
	public ClientService(IClientDao clientDao) {
		this.clientDao = clientDao;
	}
	
	public Client getClient(String identifiantClient) {
		return clientDao.extraireClient(identifiantClient);
	}
}
