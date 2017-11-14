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


}



