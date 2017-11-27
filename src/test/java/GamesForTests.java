import Shop.ComputerGame;
import Shop.ComputerGamesParams;
import Shop.Genre;
import Shop.Platforms;

import java.util.ArrayList;

/**
 * Created by StasMaster on 13.11.17.
 */


public class GamesForTests {

    public static ComputerGamesParams GameParams1() {

        return  new ComputerGamesParams("Lalka", Genre.ACTION,"DSDADS",242.2, Platforms.LINUX,18);

    }

    public static ComputerGamesParams GameParams2() {
        return new ComputerGamesParams(
                "dota", Genre.SIMULATION, "DEASDSA", 100.00, Platforms.LINUX,12);
    }
    public static ComputerGamesParams GameParams3() {
        return new ComputerGamesParams(
                "dota 22", Genre.MOBA, "this is dota 2 version  2.2", 12.2, Platforms.LINUX,23);
    }

    public static ArrayList<ComputerGame>  getDb() {
        ArrayList<ComputerGame> db = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            db.add(new ComputerGame(GameParams1()));
        }
        return db;
    }
}


