import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by StasMaster on 06.11.17.
 */
public class DataBase {

    private static List<ComputerGame> games = new ArrayList<ComputerGame>();

    public DataBase() {

    }

    public ArrayList<ComputerGame> getGamges() {
        return new ArrayList<ComputerGame>(games);
    }


    public ArrayList<ComputerGame>  search(ComputerGamesParams searched) {
        ArrayList<ComputerGame> found = new ArrayList<ComputerGame>();
        for (ComputerGame game: games) {
            if (game.getParams().check(searched)) {
                found.add(game);
            }
        }
        return found;

    }
}
