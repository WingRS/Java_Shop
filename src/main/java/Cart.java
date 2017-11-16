import java.util.ArrayList;

/**
 * Created by StasMaster on 06.11.17.
 */
public class Cart {

    private PaymentStrategy payment;

    private Customer customer;

    private DeliveryStrategy delivery;

    private ArrayList<ComputerGame> games = new ArrayList<>();

    public Cart(ArrayList<ComputerGame> games, Customer customer) {
        this.games = games;
        this.customer = customer;
    }

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public Cart(Customer customer, ArrayList<ComputerGame> games,
                PaymentStrategy payStrat, DeliveryStrategy delStrat) {
        this.customer = customer;
        this.games = games;
        this.delivery = delStrat;
        this.payment = payStrat;
    }

    public Cart(Customer customer, ComputerGame game,
                PaymentStrategy payStrat, DeliveryStrategy delStrat) {
        this.customer = customer;
        this.games.add(game);
        this.delivery = delStrat;
        this.payment = payStrat;
    }

    public Cart(Customer customer, ComputerGame game) {
        this.customer = customer;
        this.games.add(game);
    }

    public PaymentStrategy getPayment() {
        return payment;
    }

    public boolean setPayment(PaymentStrategy payment) {
        this.payment = payment;
        return true;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean setCustomer(Customer customer) {
        this.customer = customer;
        return true;
    }

    public DeliveryStrategy getDelivery() {
        return delivery;
    }

    public boolean setDelivery(DeliveryStrategy delivery) {

        this.delivery = delivery;
        return true;
    }

    public boolean removeGameFromCart(ComputerGame game) {
        if(this.games.contains(game)) {
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

    public boolean ship() {
        if(payment.pay(computeTotalPrice())) {
            delivery.delivery();
            return true;
        }
        return false;
    }
}
