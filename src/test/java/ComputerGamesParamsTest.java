import shop.ComputerGamesParams;
import shop.Genre;
import shop.Platforms;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by StasMaster on 13.11.17.
 */
public class ComputerGamesParamsTest {

    private ComputerGamesParams param1, param2;

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
        param1.setName("this is a game");
        assertTrue(param1.getName().equals("this is a game"));

    }

    @Test
    public void getGenre() throws Exception {
        assertFalse(param1.getGenre().toString().equals(param2.getGenre().toString()));
    }

    @Test
    public void setGenre() throws Exception {
        param1.setGenre(Genre.SIMULATION);
        assertTrue(param1.getGenre().toString().equals(Genre.SIMULATION.toString()));
    }

    @Test
    public void getDescr() throws Exception {
        assertFalse(param1.getDescr().equals(param2.getDescr()));
    }

    @Test
    public void setDescr() throws Exception {
        param1.setDescr("this is a descr");
        assertTrue(param1.getDescr().equals("this is a descr"));
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
        assertTrue(param1.getPlatform().toString().equals(os.toString()));
    }

    @Test
    public void setPlatform() throws Exception {
        param1.setPlatform(Platforms.MAC);
        assertTrue(param1.getPlatform().toString().equals(Platforms.MAC.toString()));
    }

    @Test
    public void getAgeRestriction() throws Exception {
        assertFalse(param1.getAgeRestriction() == param2.getAgeRestriction());
    }

    @Test
    public void setAgeRestriction() throws Exception {
        param1.setAgeRestriction(20);
        assertTrue(param1.getAgeRestriction() == 20);
    }


}