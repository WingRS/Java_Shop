import java.util.ArrayList;

/**
 * Created by StasMaster on 13.11.17.
 */
public class Customer {

    private String name;
    private String city;
    private double money;
    private Currency currency;
    private ArrayList<СomputerGame> games = new ArrayList<СomputerGame>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ArrayList<СomputerGame> getGames() {
        return  new ArrayList<>(games);
    }

    public boolean addGameToHistory(СomputerGame game) {
        if(games.add(game)) {
            return true;
        }
        return false;
    }


    public boolean payForGame(double price) {
        if( money - price > 0 ){
            money = money - price;
            return  true;
        }
        return false;

    }
}
