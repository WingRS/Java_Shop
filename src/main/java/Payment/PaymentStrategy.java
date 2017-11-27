package Payment;

import Shop.Customer;

/**
 * Created by StasMaster on 13.11.17.
 */
public interface PaymentStrategy {
    String paymentName = null;

    boolean pay(double price, Customer customer);

    String toString();

}
