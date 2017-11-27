package shop;

import payment.PaymentStrategy;

/**
 * Created by StasMaster on 13.11.17.
 */
public class CheckOutStrategy implements PaymentStrategy {

    private String paymentName = "CheckOut";


    @Override
    public boolean pay(double price, Customer customer) {
        return false;
    }
}
