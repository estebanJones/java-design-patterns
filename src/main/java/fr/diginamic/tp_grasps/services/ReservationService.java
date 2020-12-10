package fr.diginamic.tp_grasps.services;

import org.springframework.stereotype.Service;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

@Service
public class ReservationService {
	private TypeReservationDao typeReservationDao;
	public ReservationService(TypeReservationDao typeReservationDao) {
		this.typeReservationDao = typeReservationDao;
	}
	
	public TypeReservation getTypeReservation(String typeReservation) {
		return this.typeReservationDao.extraireTypeReservation(typeReservation);
	}
}
