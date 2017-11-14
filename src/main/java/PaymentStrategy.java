/**
 * Created by StasMaster on 13.11.17.
 */
public interface PaymentStrategy {
    String paymentName = null;

    boolean pay(double price);

    String toString();

}
