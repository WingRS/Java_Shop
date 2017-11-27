package delivery;

/**
 * Created by StasMaster on 27.11.17.
 */
public class NovaPoshtaDelivery implements DeliveryStrategy {
    private String deliveryName = "Nova Poshta";

    public boolean delivery() {
        System.out.println( deliveryName + " DELIVERY THE BEST");
        return true;
    }

    public String toString() {
        return deliveryName;
    }
}
