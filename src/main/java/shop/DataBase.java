package shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StasMaster on 06.11.17.
 */
public class DataBase {

    private static List<ComputerGame> games = new ArrayList<ComputerGame>();

    public DataBase() {

    }

    public DataBase(List<ComputerGame> games) {
        this.addToDb(games);
    }

    public boolean addToDb(ComputerGame game) {
        if (games.add(game)) {
            return true;
        }
        return false;
    }

    public boolean addToDb(List<ComputerGame> games) {
        if (this.games.addAll(games)) {
            return true;
        }
        return false;
    }


    public ArrayList<ComputerGame> getGames() {
        return new ArrayList<ComputerGame>(games);
    }


    public ArrayList<ComputerGame> search(ComputerGamesParams searched) {

        ArrayList<ComputerGame> found = new ArrayList<ComputerGame>();
        for (ComputerGame game : games) {
            if (game.getParams().check(searched)) {
                found.add(game);
            }
        }
        return found;

    }

}
