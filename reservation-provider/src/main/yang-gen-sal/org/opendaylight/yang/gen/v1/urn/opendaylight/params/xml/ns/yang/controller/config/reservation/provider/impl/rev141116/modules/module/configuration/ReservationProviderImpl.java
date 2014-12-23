package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.configuration.reservation.provider.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.configuration.reservation.provider.impl.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.configuration.reservation.provider.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>reservation-provider-impl</b>
 * <br />(Source path: <i>META-INF\yang\reservation-provider-impl.yang</i>):
 * <pre>
 * case reservation-provider-impl {
 *     container data-broker {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:reservation-provider:impl?revision=2014-11-16)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:reservation-provider:impl?revision=2014-11-16)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:reservation-provider:impl?revision=2014-11-16)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>reservation-provider-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:reservation-provider:impl?revision=2014-11-16)reservation-provider-impl</i>
 */
public interface ReservationProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.configuration.ReservationProviderImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:reservation-provider:impl","2014-11-16","reservation-provider-impl");;

    DataBroker getDataBroker();
    
    RpcRegistry getRpcRegistry();
    
    NotificationService getNotificationService();

}

