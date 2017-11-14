/**
 * Created by StasMaster on 13.11.17.
 */
public class PayPalStrategy implements PaymentStrategy  {

    private String paymentName = "PayPal";
    @Override
    public boolean pay(double price) {
        System.out.println("THIS IS PAYPAL");
        return  false;
    }

    @Override
    public String toString() {
        return paymentName;
    }

}
