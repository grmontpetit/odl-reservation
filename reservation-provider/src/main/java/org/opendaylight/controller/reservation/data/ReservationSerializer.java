package org.opendaylight.controller.reservation.data;

public class ReservationSerializer {

	private ReservationContainer container;

	public ReservationSerializer() {
		super();
	}

	public ReservationSerializer(ReservationContainer container) {
		super();
		this.container = container;
	}

	public ReservationContainer getContainer() {
		return container;
	}

	public void setContainer(ReservationContainer container) {
		this.container = container;
	}

	public void serialize(){
		// TODO serialize content.getReservations to a file.
	}
}
