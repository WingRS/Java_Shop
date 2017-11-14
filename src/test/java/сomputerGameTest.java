import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 13.11.17.
 */
public class сomputerGameTest {
    private сomputerGame game1, game2;


    @Before
    public void setUp() throws Exception {
        game1 = new сomputerGame( GamesForTests.GameParams1());
        game2 = new сomputerGame( GamesForTests.GameParams2());
    }

    @Test
    public void testCheck() throws Exception {
        assertFalse(game1.getParams().check(game2.getParams()));
    }

    @Test
    public void testParams(){
        assertTrue( game1.getParams().getName() == GamesForTests.GameParams1().getName() );
    }



    @Test
    public void getGameId() throws Exception {
    }

    @Test
    public void getParams() throws Exception {
    }

}