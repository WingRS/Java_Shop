
/**
 * Created by StasMaster on 13.11.17.
 */


public class GamesForTests {

    public static СomputerGamesParams GameParams1() {

        return  new СomputerGamesParams("Lalka",Genre.ACTION,"DSDADS",242.2,Platforms.LINUX,18);

    }

    public static СomputerGamesParams GameParams2() {
        return new СomputerGamesParams(
                "dota", Genre.SIMULATION, "DEASDSA", 232.2, Platforms.LINUX,12);
    }
    public static СomputerGamesParams GameParams3() {
        return new СomputerGamesParams(
                "dota 22", Genre.MOBA, "this is dota 2 version  2.2", 12.2, Platforms.LINUX,23);
    }
}


