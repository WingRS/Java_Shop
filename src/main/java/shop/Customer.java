package shop;

import java.util.ArrayList;

/**
 * Created by StasMaster on 13.11.17.
 */
public class Customer {

    private String name;
    private String city;
    private double money;
    private Currency currency;
    private ArrayList<ComputerGame> games = new ArrayList<ComputerGame>();


    public Customer(String name, String city){
        this.name = name;
        this.city = city;
    }

    public Customer(String name, String city, double money, Currency currency, ComputerGame game){
        this.name = name;
        this.city = city;
        this.money = money;
        this.currency = currency;
        this.games.add(game);
    }


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

    public boolean setMoney(double money) {
        this.money = money;
        return false;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ArrayList<ComputerGame> getGames() {
        return  new ArrayList<>(games);
    }

    public boolean addGameToHistory(ComputerGame game) {
        if(games.add(game)) {
            return true;
        }
        return false;
    }


    public boolean payForGame(double price) {
        if(money - price > 0) {
            money = money - price;
            return  true;
        }
        return false;

    }
}
