import shop.ComputerGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 13.11.17.
 */
public class ComputerGameTest {
    private ComputerGame game1, game2;


    @Before
    public void setUp() throws Exception {
        game1 = new ComputerGame( GamesForTests.GameParams1());
        game2 = new ComputerGame( GamesForTests.GameParams2());
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
        assertFalse(game1.getGameId() == game2.getGameId());
    }

    @Test
    public void getParams() throws Exception {
        assertFalse(game1.getParams().getPrice() == game2.getParams().getPrice());
    }

}