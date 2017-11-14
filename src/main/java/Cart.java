import java.util.ArrayList;

/**
 * Created by StasMaster on 06.11.17.
 */
public class Cart {

    private PaymentStrategy payment;

    private Customer customer;

    private DeliveryStrategy delivery;

    private ArrayList<ComputerGame> games;

    public PaymentStrategy getPayment() {
        return payment;
    }

    public void setPayment(PaymentStrategy payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryStrategy getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryStrategy delivery) {
        this.delivery = delivery;
    }

    public boolean removeGameFromCart(ComputerGame game) {
        if(this.games.contains(game)){
            this.games.remove(game);
            return true;
        }
        return false;
    }

    public boolean addGameToCart(ComputerGame game) {
        if (!games.add(game)) {
            return false;
        }
        return true;
    }

    public double computeTotalPrice() {
        double price = 0;
        for (ComputerGame curInstance: games) {
            price += curInstance.getParams().getPrice();
        }
        return price;
    }

    public void ship(){
        if(payment.pay(computeTotalPrice())){
            delivery.delivery(games);
        }
    }
}
