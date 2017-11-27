package carts;

import shop.ComputerGame;
import shop.ComputerGamesParams;
import shop.Genre;
import shop.Platforms;

import java.util.ArrayList;

/**
 * Created by StasMaster on 27.11.17.
 */
public class BonusCart extends CartDecorator {


    public BonusCart(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship(ArrayList<ComputerGame>  games) {
       games.add(new ComputerGame(new ComputerGamesParams("Dota 2", Genre.MOBA,
                                                        "this is a bonus game for you", 0.0,
                                                            Platforms.PC, 14)));
        return super.ship(games);
    }
}
