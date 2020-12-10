package fr.diginamic.tp_grasps.interfaces;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

public interface IRerservationFactory {
	public Reservation getInstance(LocalDateTime dateReservation, int nbPlaces, Client client);
}
