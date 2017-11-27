package delivery;

/**
 * Created by StasMaster on 13.11.17.
 */
public interface DeliveryStrategy {

    String deliveryName = null;
    boolean delivery();
    String toString();
}
