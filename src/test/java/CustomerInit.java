import Shop.ComputerGame;
import Shop.Currency;
import Shop.Customer;

/**
 * Created by StasMaster on 15.11.17.
 */
public class CustomerInit {

    public static Customer createCustomer1() {
        return  new Customer("Yura","Kalush",200.0, Currency.POUND, new ComputerGame(GamesForTests.GameParams1()));
    }

    public static Customer createCustomer2() {
        return new Customer("Ivan","Lviv",25.25, Currency.USD, new ComputerGame(GamesForTests.GameParams2()));
    }

}
