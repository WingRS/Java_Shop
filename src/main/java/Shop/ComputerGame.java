package Shop;

/**
 * Created by StasMaster on 06.11.17.
 */
public class ComputerGame {

    private static int idCounter = 0;

    private final int gameId;
    private final ComputerGamesParams params;

    public ComputerGame(ComputerGamesParams gameParams) {
        this.gameId = ComputerGame.idCounter++;
        this.params = gameParams;
    }

    public int getGameId() {
        return gameId;
    }

    public ComputerGamesParams getParams() {
        return params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerGame that = (ComputerGame) o;

        if (gameId != that.gameId) return false;
        return params.equals(that.params);
    }

    @Override
    public int hashCode() {
        int result = gameId;
        result = 31 * result + params.hashCode();
        return result;
    }
}



