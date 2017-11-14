/**
 * Created by StasMaster on 06.11.17.
 */
public class сomputerGame {

    private static int Idcounter = 0;

    private final int gameId;
    private final сomputerGamesParams params;

    public сomputerGame(сomputerGamesParams gameParams) {
        this.gameId = сomputerGame.Idcounter++;
        this.params = gameParams;
    }

    public int getGameId() {
        return gameId;
    }

    public сomputerGamesParams getParams() {
        return params;
    }


}



