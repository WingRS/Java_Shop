package carts;

import delivery.DeliveryStrategy;
import payment.PaymentStrategy;
import shop.ComputerGame;
import shop.Customer;

import java.util.ArrayList;

/**
 * Created by StasMaster on 27.11.17.
 */
public abstract class CartDecorator extends Cart {

    private Cart cart;

    public CartDecorator(Cart cart) {
        super(cart);
        this.cart = cart;
    }

    @Override
    public PaymentStrategy getPayment() {
        return this.cart.getPayment();
    }

    @Override
    public boolean setPayment(PaymentStrategy paymentStrategy) {
        return this.cart.setPayment(paymentStrategy);
    }

    @Override
    public Customer getCustomer() {
        return this.cart.getCustomer();
    }


    @Override
    public boolean setCustomer( Customer customer ) {
        this.cart.setCustomer(customer);
        return true;
    }

    @Override
    public DeliveryStrategy getDelivery() {
        return this.cart.getDelivery();
    }

    @Override
    public boolean setDelivery(DeliveryStrategy deliveryStrategy) {
        this.cart.setDelivery(deliveryStrategy);
        return  true;
    }

    @Override
    public boolean addGameToCart(ArrayList<ComputerGame> games) {
        return this.cart.addGameToCart(games);
    }

    @Override
    public boolean removeGameFromCart(ComputerGame game) {
        return this.cart.removeGameFromCart(game);
    }

    @Override
    public boolean addGameToCart(ComputerGame game) {
        return this.cart.addGameToCart(game);
    }

    @Override
    public ArrayList<ComputerGame> getGames() {
        return this.cart.getGames();
    }

    @Override
    public double computeTotalPrice() {
        return this.cart.computeTotalPrice();
    }

    @Override
    public boolean ship(ArrayList<ComputerGame> games) {
        return this.cart.ship(games);
    }

    @Override
    public boolean pay() {
        return this.cart.pay();
    }
}
