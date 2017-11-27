package shop;

/**
 * Created by StasMaster on 06.11.17.
 */
public class ComputerGamesParams {


    private String name;

    private Genre genre;

    private String descr;

    private double price;

    private Platforms platform;

    private int ageRestriction;




    public ComputerGamesParams(ComputerGame game) {
        this.name = game.getParams().getName();
        this.genre = game.getParams().getGenre();
        this.descr = game.getParams().getDescr();
        this.price = game.getParams().getPrice();
        this.platform = game.getParams().getPlatform();
        this.ageRestriction = game.getParams().getAgeRestriction();
    }

    public ComputerGamesParams(String name, Genre genre,
                               String descr, Double price,
                               Platforms platform,
                               int ageRestriction) {
        this.name = name;
        this.genre = genre;
        this.descr = descr;
        this.price = price;
        this.platform = platform;
        this.ageRestriction = ageRestriction;

    }



    public boolean check(ComputerGamesParams otherParams) {
        if ((name.equals(otherParams.getName()))
                || (ageRestriction == otherParams.getAgeRestriction())
                || ( price == otherParams.getPrice())
                || ((genre.equals(otherParams.getGenre()))
                && otherParams.getGenre().equals(genre))
                || ((platform.equals(otherParams.getPlatform())
                && otherParams.getPlatform().equals(platform)))) {
            return false;
        }
        return true;
    }



    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean setGenre(Genre genre) {
        this.genre = genre;
        return true;
    }

    public String getDescr() {
        return descr;
    }

    public boolean setDescr(String descr) {
        this.descr = descr;
        return true;
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(double price) {
        this.price = price;
        return true;
    }

    public Platforms getPlatform() {
        return platform;
    }

    public boolean setPlatform(Platforms platform) {
        this.platform = platform;
        return true;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public boolean setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        ComputerGamesParams that = (ComputerGamesParams) o;

        if (Double.compare(that.price, price) != 0) { return false; }
        if (ageRestriction != that.ageRestriction) { return false; }
        if (!name.equals(that.name)) { return false; }
        if (genre != that.genre) { return false; }
        if (!descr.equals(that.descr)) { return false; }
        return platform == that.platform;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + descr.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + platform.hashCode();
        result = 31 * result + ageRestriction;
        return result;
    }
}
