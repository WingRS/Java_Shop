import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by StasMaster on 13.11.17.
 */
public class ComputerGamesParamsTest {

    private сomputerGamesParams param1, param2;

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
    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getGenre() throws Exception {
    }

    @Test
    public void setGenre() throws Exception {
    }

    @Test
    public void getDescr() throws Exception {
    }

    @Test
    public void setDescr() throws Exception {
    }

    @Test
    public void getPrice() throws Exception {
    }

    @Test
    public void setPrice() throws Exception {
    }

    @Test
    public void getPlatform() throws Exception {
    }

    @Test
    public void setPlatform() throws Exception {
    }

    @Test
    public void getAgeRestriction() throws Exception {
    }

    @Test
    public void setAgeRestriction() throws Exception {
    }


}