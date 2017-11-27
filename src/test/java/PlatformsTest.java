import shop.Platforms;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class PlatformsTest {
    private Platforms platform;

    @Before
    public void setUp() throws Exception {
        platform = Platforms.MAC;
    }

    @Test
    public void toStringTest() throws Exception {
        assertTrue(platform.toString().equals(Platforms.MAC.toString()));
    }

}