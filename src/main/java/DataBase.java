import java.util.ArrayList;
import java.util.List;

/**
 * Created by StasMaster on 06.11.17.
 */
public class DataBase {

    private static List<сomputerGame> games = new ArrayList<сomputerGame>();

    public DataBase() {

    }

    public ArrayList<сomputerGame> getGamges() {
        return new ArrayList<сomputerGame>(games);
    }


    public ArrayList<сomputerGame>  search(сomputerGamesParams searched) {

        ArrayList<сomputerGame> found = new ArrayList<сomputerGame>();
        for (сomputerGame game: games) {
            if (game.getParams().check(searched)) {
                found.add(game);
            }
        }
        return found;

    }
}
