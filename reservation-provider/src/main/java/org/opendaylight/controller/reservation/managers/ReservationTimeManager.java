package org.opendaylight.controller.reservation.managers;

import org.opendaylight.controller.reservation.data.ReservationContainer;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.Reservation;

/**
 * Classe statique pour verifier le temps des reservations.
 * Active ou desactive des reservations en fonction des
 * periodes de temps.
 *
 */
public class ReservationTimeManager {

	// TODO Creer un thread pour verifier les reservations.
	protected static ReservationTimeManager instance = null;
	protected static ReservationContainer container;

	public static ReservationTimeManager getInstance(){
		if (instance == null){
			instance = new ReservationTimeManager();
		}
		return instance;
	}
	
	// TODO utiliser une gestion de zone critique pour verifier les reservations
	public static void verifierTemps(){
		while (true){
			for (Reservation r: container.getReservations()){
				// TODO check time on reservation
			}
		}
	}

	public void setReservationContainer(ReservationContainer container){
		this.container = container;
	}
}
