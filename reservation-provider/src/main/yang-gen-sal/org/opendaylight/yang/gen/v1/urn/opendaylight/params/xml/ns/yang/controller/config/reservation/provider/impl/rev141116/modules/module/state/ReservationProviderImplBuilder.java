package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl
 */
public class ReservationProviderImplBuilder {

    private java.lang.Long _reservationsMade;
    private static List<Range<BigInteger>> _reservationsMade_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> augmentation = new HashMap<>();

    public ReservationProviderImplBuilder() {
    } 
    

    public ReservationProviderImplBuilder(ReservationProviderImpl base) {
        this._reservationsMade = base.getReservationsMade();
        if (base instanceof ReservationProviderImplImpl) {
            ReservationProviderImplImpl _impl = (ReservationProviderImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Long getReservationsMade() {
        return _reservationsMade;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ReservationProviderImplBuilder setReservationsMade(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _reservationsMade_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _reservationsMade_range));
            }
        }
        this._reservationsMade = value;
        return this;
    }
    public static List<Range<BigInteger>> _reservationsMade_range() {
        if (_reservationsMade_range == null) {
            synchronized (ReservationProviderImplBuilder.class) {
                if (_reservationsMade_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _reservationsMade_range = builder.build();
                }
            }
        }
        return _reservationsMade_range;
    }
    
    public ReservationProviderImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ReservationProviderImpl build() {
        return new ReservationProviderImplImpl(this);
    }

    private static final class ReservationProviderImplImpl implements ReservationProviderImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl.class;
        }

        private final java.lang.Long _reservationsMade;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> augmentation = new HashMap<>();

        private ReservationProviderImplImpl(ReservationProviderImplBuilder base) {
            this._reservationsMade = base.getReservationsMade();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Long getReservationsMade() {
            return _reservationsMade;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_reservationsMade == null) ? 0 : _reservationsMade.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl)obj;
            if (_reservationsMade == null) {
                if (other.getReservationsMade() != null) {
                    return false;
                }
            } else if(!_reservationsMade.equals(other.getReservationsMade())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ReservationProviderImplImpl otherImpl = (ReservationProviderImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.reservation.provider.impl.rev141116.modules.module.state.ReservationProviderImpl>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ReservationProviderImpl [");
            boolean first = true;
        
            if (_reservationsMade != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reservationsMade=");
                builder.append(_reservationsMade);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
