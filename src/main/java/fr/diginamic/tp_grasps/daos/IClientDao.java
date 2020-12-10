package fr.diginamic.tp_grasps.daos;

import fr.diginamic.tp_grasps.beans.Client;

public interface IClientDao {

	Client extraireClient(String id);

}