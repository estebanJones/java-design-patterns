package fr.diginamic.tp_grasps.daos;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface ITypeReservationDao {

	TypeReservation extraireTypeReservation(String type);

}