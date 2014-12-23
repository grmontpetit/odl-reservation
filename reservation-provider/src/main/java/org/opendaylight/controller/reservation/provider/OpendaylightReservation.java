package org.opendaylight.controller.reservation.provider;

import java.util.concurrent.Future;

import org.opendaylight.controller.config.yang.config.cup_provider.impl.ReservationProviderRuntimeMXBean;
import org.opendaylight.controller.md.sal.binding.api.DataChangeListener;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeEvent;
import org.opendaylight.controller.reservation.data.ReservationContainer;
import org.opendaylight.controller.reservation.data.ReservationDeserializer;
import org.opendaylight.controller.reservation.data.ReservationSerializer;
import org.opendaylight.controller.reservation.managers.ConflictResolver;
import org.opendaylight.controller.reservation.managers.ReservationTimeManager;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.ActiverReservationInput;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.AjouterReservationInput;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.CancellerReservationInput;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.DesactiverReservationInput;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.ModifierReservationInput;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.ReservationService;
import org.opendaylight.yang.gen.v1.inocybe.rev141116.SupprimerReservationInput;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcResult;

public class OpendaylightReservation implements ReservationService, AutoCloseable, DataChangeListener, ReservationProviderRuntimeMXBean{

	private ReservationContainer container;
	private ReservationDeserializer deserializer;
	private ReservationSerializer serializer;
	private ConflictResolver conflictResolver;
	private ReservationTimeManager timeManager;
	
	@Override
	public Future<RpcResult<Void>> activerReservation(
			ActiverReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RpcResult<Void>> ajouterReservation(
			AjouterReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RpcResult<Void>> cancellerReservation(
			CancellerReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RpcResult<Void>> desactiverReservation(
			DesactiverReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RpcResult<Void>> modifierReservation(
			ModifierReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RpcResult<Void>> supprimerReservation(
			SupprimerReservationInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onDataChanged(
			AsyncDataChangeEvent<InstanceIdentifier<?>, DataObject> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getReservationsMade() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearReservationsMade() {
		// TODO Auto-generated method stub
		
	}

}
