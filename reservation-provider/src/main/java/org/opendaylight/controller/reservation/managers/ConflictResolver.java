package org.opendaylight.controller.reservation.managers;

import org.opendaylight.yang.gen.v1.inocybe.rev141116.Reservation;

public class ConflictResolver {

	private static ConflictResolver instance = null;

	public static ConflictResolver getInstance(){
		if (instance == null){
			instance = new ConflictResolver();
		}
		return instance;
	}

	protected ConflictResolver(){}

	/**
	 * Verifie s'il y a des conflits entre deux reservations.
	 * @param r1
	 * @param r2
	 * @return true si un conflit est detecte.
	 */
	public static boolean veriferConflits(Reservation r1, Reservation r2){
		// TODO check endpoints within the reservation
		return false;
	}
	
	/**
	 * Essaie de resoudre les conflits.
	 * 
	 * @return false is impossible
	 */
	public static boolean resoudreConflits(){
		return false;
	}
}
