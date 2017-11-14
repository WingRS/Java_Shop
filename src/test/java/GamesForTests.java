
/**
 * Created by StasMaster on 13.11.17.
 */


public class GamesForTests {

    public static ComputerGamesParams GameParams1() {

        return  new ComputerGamesParams("Lalka",Genre.ACTION,"DSDADS",242.2,Platforms.LINUX,18);

    }

    public static ComputerGamesParams GameParams2() {
        return new ComputerGamesParams(
                "dota", Genre.SIMULATION, "DEASDSA", 232.2, Platforms.LINUX,12);
    }
    public static ComputerGamesParams GameParams3() {
        return new ComputerGamesParams(
                "dota 22", Genre.MOBA, "this is dota 2 version  2.2", 12.2, Platforms.LINUX,23);
    }
}


