import Shop.ComputerGame;
import Shop.DataBase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 16.11.17.
 */
public class DataBaseTest {
    private DataBase db1, db2;

    @Before
    public void setUp() {
        db1 = new DataBase(GamesForTests.getDb());
        db2 = new DataBase(GamesForTests.getDb());
    }

    @Test
    public void addToDb() throws Exception {
        assertTrue(db1.addToDb(new ComputerGame(GamesForTests.GameParams1())));
    }

    @Test
    public void addToDbGames() throws Exception {
        List<ComputerGame> games = new ArrayList<>();
        for(int i = 0; i< 10; i++) {
            games.add(new ComputerGame(GamesForTests.GameParams1()));
        }
        assertTrue(db2.addToDb(games));
    }

    @Test
    public void getGames() throws Exception {
        int length1 = db1.getGames().size();
        int lenght2 = db2.getGames().size();
        ArrayList games = db1.getGames();
        assertTrue(length1 == lenght2);
    }

    @Test
    public void search() throws Exception {

    }


}