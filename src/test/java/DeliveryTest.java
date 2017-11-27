import delivery.DeliveryStrategy;
import delivery.DhlDelivery;
import delivery.NovaPoshtaDelivery;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by StasMaster on 27.11.17.
 */
public class DeliveryTest {

    @Test
    public void test() throws Exception {
        DeliveryStrategy deliveryStrategy1 = new NovaPoshtaDelivery();
        DeliveryStrategy deliveryStrategy2 = new DhlDelivery();
        assertTrue(deliveryStrategy1.delivery());
        assertTrue(deliveryStrategy2.delivery());
        assertEquals(deliveryStrategy2.toString(),"DHL");
        assertEquals(deliveryStrategy1.toString(),"Nova Poshta");

    }
}
