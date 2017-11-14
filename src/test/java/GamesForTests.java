
/**
 * Created by StasMaster on 13.11.17.
 */


public class GamesForTests {

    public static сomputerGamesParams GameParams1() {

        return  new сomputerGamesParams("Lalka",Genre.ACTION,"DSDADS",242.2,Platforms.LINUX,18);

    }

    public static сomputerGamesParams GameParams2() {
        return new сomputerGamesParams(
                "dota", Genre.SIMULATION, "DEASDSA", 232.2, Platforms.LINUX,12);
    }
    public static сomputerGamesParams GameParams3() {
        return new сomputerGamesParams(
                "dota 22", Genre.MOBA, "this is dota 2 version  2.2", 12.2, Platforms.LINUX,23);
    }
}


