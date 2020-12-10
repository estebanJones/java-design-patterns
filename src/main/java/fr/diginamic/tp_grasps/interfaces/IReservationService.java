package fr.diginamic.tp_grasps.interfaces;

import fr.diginamic.tp_grasps.Params;
import fr.diginamic.tp_grasps.beans.Reservation;

public interface IReservationService {
	public Reservation creerReservation(Params params, String dateReservationStr, String identifiantClient,  String typeReservation,int nbPlaces);
}
