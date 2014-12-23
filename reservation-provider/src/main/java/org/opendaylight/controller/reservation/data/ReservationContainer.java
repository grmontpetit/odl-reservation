package org.opendaylight.controller.reservation.data;

import java.util.ArrayList;

import org.opendaylight.yang.gen.v1.inocybe.rev141116.Reservation;

public class ReservationContainer {

	private ArrayList<Reservation> reservations;

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
}
