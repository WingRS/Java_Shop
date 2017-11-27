package Payment;

import Shop.Customer;

/**
 * Created by StasMaster on 13.11.17.
 */
public class PayPalStrategy implements PaymentStrategy  {

    private String paymentName = "PayPal";
    @Override
    public boolean pay(double price, Customer customer) {
        System.out.println("THIS IS PAYPAL");
        if(customer.setMoney(customer.getMoney()-price)){
            return true;
        }
        return  false;
    }

    @Override
    public String toString() {
        return paymentName;
    }

}
