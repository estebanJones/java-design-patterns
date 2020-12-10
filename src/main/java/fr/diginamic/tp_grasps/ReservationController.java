package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factory.ReservationFactory;
import fr.diginamic.tp_grasps.services.ClientService;
import fr.diginamic.tp_grasps.services.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
@Controller
public class ReservationController {
	private ClientService clientService;
	private ReservationService reservationService;
	private DateUtils dateUtils;
	/** formatter */
	public ReservationController(DateUtils dateUtils, ClientService clientService, ReservationService reservationService) {
		this.dateUtils = dateUtils;
		this.clientService = clientService;
		this.reservationService = reservationService;
	}
	
	/** DAO permettant d'accéder à la table des types de réservation */

	
	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();
		return this.reservationService.creerReservation(params, identifiantClient, dateReservationStr, typeReservation, nbPlaces);
	}
}
