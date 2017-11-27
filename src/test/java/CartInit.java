import Carts.Cart;
import Shop.ComputerGame;

/**
 * Created by StasMaster on 15.11.17.
 */
public class CartInit {

    public static Cart getCartOne() {
       return new Cart(CustomerInit.createCustomer1(),new ComputerGame(GamesForTests.GameParams2()));
    }

    public static Cart gatCartTwo() {
        return new Cart(CustomerInit.createCustomer2(), new ComputerGame(GamesForTests.GameParams3()));
    }

}
