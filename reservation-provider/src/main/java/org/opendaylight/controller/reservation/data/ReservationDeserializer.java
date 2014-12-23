package org.opendaylight.controller.reservation.data;

public class ReservationDeserializer {

	private ReservationContainer container;

	public ReservationDeserializer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationDeserializer(ReservationContainer container) {
		super();
		this.container = container;
	}
	public ReservationContainer getContainer() {
		return container;
	}
	public void setContainer(ReservationContainer container) {
		this.container = container;
	}
	public void deserialize(){
		// TODO read the file that has been serialized.
	}
}
