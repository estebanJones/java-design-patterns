package fr.diginamic.tp_grasps.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import fr.diginamic.tp_grasps.Params;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.factory.ReservationFactory;
import fr.diginamic.tp_grasps.interfaces.IReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

@Service
public class ReservationService implements IReservationService {
	private ITypeReservationDao typeReservationDao;
	private ClientService clientService;
	private ReservationFactory reservationfactory;
	private DateUtils dateUtils;
	
	/** formatter */
	public ReservationService(DateUtils dateUtils, ClientService clientService, ITypeReservationDao typeReservationDao) {
		this.typeReservationDao = typeReservationDao;
		this.dateUtils = dateUtils;
		this.clientService = clientService;
	}
	
	@Override
	public Reservation creerReservation(Params params, String identifiantClient,  String dateReservationStr, String typeReservation, int nbPlaces) {
	// 1) Récupération des infos provenant de la classe appelante
			
			// 2) Conversion de la date de réservation en LocalDateTime
			LocalDateTime dateReservation = this.dateUtils.toDate(dateReservationStr);
			
			// 3) Extraction de la base de données des informations client
			Client client = this.clientService.getClient(identifiantClient);
			
			// 4) Extraction de la base de données des infos concernant le type de la réservation
			TypeReservation type = this.typeReservationDao.extraireTypeReservation(typeReservation);
			
			// 5) Création de la réservation
			Reservation reservation = this.reservationfactory.getInstance(dateReservation, nbPlaces, client);
			
			// 6) Ajout de la réservation au client
			client.addReservation(reservation);
			
			// 7) Calcul du montant total de la réservation qui dépend:
			//    - du nombre de places
			//    - de la réduction qui s'applique si le client est premium ou non
			reservation.calculeMontantTotal(type);
		
			return reservation;
	}
}
