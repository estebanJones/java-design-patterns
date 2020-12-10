package fr.diginamic.tp_grasps.factory;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.interfaces.IRerservationFactory;

@Component
public class ReservationFactory implements IRerservationFactory {
	@Override
	public Reservation getInstance(LocalDateTime dateReservation, int nbPlaces, Client client) {
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		return reservation;
	}
}
