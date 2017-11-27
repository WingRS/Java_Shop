import payment.PayPalStrategy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class PayPalStrategyTest {
    private PayPalStrategy strategy;
    @Before
    public void setUp() throws Exception {
        strategy = new PayPalStrategy();
    }

    @Test
    public void pay() throws Exception {
        assertFalse(strategy.pay(20, CustomerInit.createCustomer1()));
    }

    @Test
    public void toStringTest() throws Exception {
        assertTrue(strategy.toString().equals(new PayPalStrategy().toString()));
    }


}