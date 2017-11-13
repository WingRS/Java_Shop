/**
 * Created by StasMaster on 13.11.17.
 */
public interface PaymentStrategy {

    public String paymentName = null;

    public abstract boolean pay(double price);

}
