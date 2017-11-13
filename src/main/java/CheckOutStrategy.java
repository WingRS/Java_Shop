/**
 * Created by StasMaster on 13.11.17.
 */
public class CheckOutStrategy implements PaymentStrategy {

    private String paymentName = "CheckOut";
    @Override
    public boolean pay(double price) {
        System.out.println(paymentName);
        return true;
    }

}
