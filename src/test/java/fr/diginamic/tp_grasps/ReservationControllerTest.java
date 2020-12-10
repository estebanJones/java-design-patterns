package fr.diginamic.tp_grasps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factory.ReservationFactory;
import fr.diginamic.tp_grasps.services.ClientService;
import fr.diginamic.tp_grasps.services.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

public class ReservationControllerTest {
	/** DELTA */
	private static final double DELTA = 0.0000001;
	
	@Test
	public void testCreerReservationTheatrePremium() {
		
		Params params = new Params();
		params.setDateReservation("20/11/2020 19:55:00");
		params.setNbPlaces(3);
		params.setIdentifiantClient("1");
		params.setTypeReservation("TH"); // Théâtre
		this.getInstance();
		
		ReservationController controller = this.getInstance();
		Reservation reservation = controller.creerReservation(params);
		
		assertEquals(382.5, reservation.getTotal(), DELTA);
	}
	
	@Test
	public void testCreerReservationTheatreNonPremium() {
		
		Params params = new Params();
		params.setDateReservation("20/11/2020 19:55:00");
		params.setNbPlaces(3);
		params.setIdentifiantClient("3");
		params.setTypeReservation("TH"); // Théâtre
		this.getInstance();
		ReservationController controller = this.getInstance();
		Reservation reservation = controller.creerReservation(params);
		
		assertEquals(450.0, reservation.getTotal(), DELTA);
	}
	
	@Test
	public void testCreerReservationCinemaPremium() {
		
		Params params = new Params();
		params.setDateReservation("21/11/2020 20:30:00");
		params.setNbPlaces(4);
		params.setIdentifiantClient("2");
		params.setTypeReservation("CI"); // Théâtre
		ReservationController controller = this.getInstance();
		Reservation reservation = controller.creerReservation(params);
		
		assertEquals(43.6, reservation.getTotal(), DELTA);
	}
	
	@Test
	public void testCreerReservationCinemaNonPremium() {
		
		Params params = new Params();
		params.setDateReservation("21/11/2020 20:30:00");
		params.setNbPlaces(4);
		params.setIdentifiantClient("3");
		params.setTypeReservation("CI"); // Théâtre
		
		ReservationController controller = this.getInstance();
		Reservation reservation = controller.creerReservation(params);
		
		assertEquals(43.6, reservation.getTotal(), DELTA);
	}
	
	public ReservationController getInstance() {
		return new ReservationController(new ReservationService( new DateUtils(), new ClientService(new ClientDao()), new ReservationFactory(), new TypeReservationDao()));
	}
	private TypeReservationDao typeReservationDao;
	private ClientService clientService;
	private ReservationFactory reservationfactory;
	private DateUtils dateUtils;

}
