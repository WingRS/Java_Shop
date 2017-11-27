package Delivery;

/**
 * Created by StasMaster on 16.11.17.
 */
public class DhlDelivery implements DeliveryStrategy {

    private String deliveryName = "DHL";

    public boolean delivery() {
        System.out.println("DHL DELIVERY THE BEST");
        return true;
    }

    public String toString() {
        return deliveryName;
    }
}
