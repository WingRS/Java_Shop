/**
 * Created by StasMaster on 06.11.17.
 */
public class ComputerGame {

    private static int Idcounter = 0;

    private final int gameId;
    private final сomputerGamesParams params;

    public ComputerGame(сomputerGamesParams gameParams) {
        this.gameId = ComputerGame.Idcounter++;
        this.params = gameParams;
    }

    public int getGameId() {
        return gameId;
    }

    public сomputerGamesParams getParams() {
        return params;
    }


}



