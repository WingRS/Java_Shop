/**
 * Created by StasMaster on 06.11.17.
 */
public class СomputerGame {

    private static int Idcounter = 0;

    private final int gameId;
    private final СomputerGamesParams params;

    public СomputerGame(СomputerGamesParams gameParams) {
        this.gameId = СomputerGame.Idcounter++;
        this.params = gameParams;
    }

    public int getGameId() {
        return gameId;
    }

    public СomputerGamesParams getParams() {
        return params;
    }


}



