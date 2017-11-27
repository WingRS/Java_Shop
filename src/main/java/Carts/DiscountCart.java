package Carts;

import Carts.Cart;
import Carts.CartDecorator;

/**
 * Created by StasMaster on 27.11.17.
 */
public class DiscountCart extends CartDecorator {


    public DiscountCart(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        double price = super.computeTotalPrice();
        return price - price*0.22;
    }
}
