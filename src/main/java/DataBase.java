import java.util.ArrayList;
import java.util.List;

/**
 * Created by StasMaster on 06.11.17.
 */
public class DataBase {

    private static List<СomputerGame> games = new ArrayList<СomputerGame>();

    public DataBase() {

    }

    public ArrayList<СomputerGame> getGamges() {
        return new ArrayList<СomputerGame>(games);
    }


    public ArrayList<СomputerGame>  search(СomputerGamesParams searched) {

        ArrayList<СomputerGame> found = new ArrayList<СomputerGame>();
        for (СomputerGame game: games) {
            if (game.getParams().check(searched)) {
                found.add(game);
            }
        }
        return found;

    }
}
