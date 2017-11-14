import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by StasMaster on 13.11.17.
 */
public class сomputerGamesParamsTest {

    private СomputerGamesParams param1, param2;

    @Before
    public void setUp() throws Exception {
        param1 = GamesForTests.GameParams1();
        param2 = GamesForTests.GameParams2();
    }

    @Test
    public void checkTest() throws Exception {
        assertFalse(param1.check(param2));
    }


    @Test
    public void testDescr() throws Exception {
        assertFalse(param1.getDescr() == param2.getDescr());
    }


    @Test
    public void check() throws Exception {
        assertFalse(param1.check(param2));
    }

    @Test
    public void getName() throws Exception {
        assertFalse(param1.getName() == param2.getName());
    }

    @Test
    public void setName() throws Exception {

    }

    @Test
    public void getGenre() throws Exception {
        assertFalse(param1.getGenre().toString().equals(param2.getGenre().toString()));
    }

    @Test
    public void setGenre() throws Exception {
    }

    @Test
    public void getDescr() throws Exception {
        assertFalse(param1.getDescr() == param2.getDescr());
    }

    @Test
    public void setDescr() throws Exception {
    }

    @Test
    public void getPrice() throws Exception {
        assertFalse(param1.getPrice() == param2.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        double price = 23.45;
        param1.setPrice(price);
        assertTrue(param1.getPrice() == price);
    }

    @Test
    public void getPlatform() throws Exception {
        Platforms os = Platforms.MAC;
        param1.setPlatform(os);
        assertTrue(param1.getPlatform().toString() ==  os.toString() );
    }

    @Test
    public void setPlatform() throws Exception {
    }

    @Test
    public void getAgeRestriction() throws Exception {
        assertFalse(param1.getAgeRestriction() == param2.getAgeRestriction());
    }

    @Test
    public void setAgeRestriction() throws Exception {
    }


}