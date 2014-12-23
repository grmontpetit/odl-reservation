package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.ClearReservationsMadeInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>reservation-provider-impl</b>
 * <br />(Source path: <i>META-INF\yang\reservation-provider-impl.yang</i>):
 * <pre>
 * rpc clear-reservations-made {
 *     "JMX call to clear the reservations-made counter.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface ReservationProviderImplService
    extends
    RpcService
{




    /**
     * JMX call to clear the reservations-made counter.
     */
    Future<RpcResult<java.lang.Void>> clearReservationsMade(ClearReservationsMadeInput input);

}

