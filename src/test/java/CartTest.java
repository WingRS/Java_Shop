import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 13.11.17.
 */
public class CartTest {

    private Cart cart1,cart2;

    @Before
    public void setUp() throws Exception {
        cart1 = CartInit.getCartOne();
        cart2 = CartInit.gatCartTwo();
        cart1.setPayment(new PayPalStrategy());
        cart2.setPayment(new PayPalStrategy());
    }

    @Test
    public void getPayment() throws Exception {
        assertTrue(cart1.getPayment().toString().equals(cart2.getPayment().toString()));
    }



    @Test
    public void getCustomer() throws Exception {
        assertFalse(cart1.getCustomer().getName().equals(cart2.getCustomer().getName()));
    }

    @Test
    public void setCustomer() throws Exception {
    }

    @Test
    public void getDelivery() throws Exception {

    }

    @Test
    public void setDelivery() throws Exception {
    }

    @Test
    public void addGameToCart() throws Exception {
        assertTrue(cart1.addGameToCart(new ComputerGame(GamesForTests.GameParams2())));
    }

    @Test
    public void computeTotalPrice() throws Exception {
        double price = GamesForTests.GameParams2().getPrice();
        assertTrue(cart1.computeTotalPrice() == price);
    }

    @Test
    public void removeGameFromCartTest() throws Exception {
        assertFalse(cart1.removeGameFromCart(new ComputerGame(GamesForTests.GameParams2())));
    }

    @Test
    public void ship() throws Exception {
    }

}