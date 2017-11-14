/**
 * Created by StasMaster on 06.11.17.
 */
public class ComputerGamesParams {


    private String Name;

    private Genre Genre;

    private String Descr;

    private double Price;

    private Platforms Platform;

    private int ageRestriction;




    public ComputerGamesParams(ComputerGame game) {
        this.Name = game.getParams().getName();
        this.Genre = game.getParams().getGenre();
        this.Descr = game.getParams().getDescr();
        this.Price = game.getParams().getPrice();
        this.Platform = game.getParams().getPlatform();
        this.ageRestriction = game.getParams().getAgeRestriction();
    }

    public ComputerGamesParams(String Name, Genre genre, String Descr, Double Price, Platforms Platform, int AgeRestriction ) {


        this.Name = Name;
        this.Genre = genre;
        this.Descr = Descr;
        this.Price = Price;
        this.Platform = Platform;
        this.ageRestriction = AgeRestriction;

    }



    public boolean check(ComputerGamesParams otherParams) {
        if ((Name.equals(otherParams.getName())) || (ageRestriction == otherParams.getAgeRestriction())
                || (Price == otherParams.getPrice())  ||
                ((Genre.equals(otherParams.getGenre())) && otherParams.getGenre().equals(Genre))
                || ((Platform.equals(otherParams.getPlatform())  && otherParams.getPlatform().equals(Platform)))) {
            return false;
        }
        return true;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Genre getGenre() {
        return Genre;
    }

    public void setGenre(Genre genre) {
        Genre = genre;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String descr) {
        Descr = descr;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public Platforms getPlatform() {
        return Platform;
    }

    public void setPlatform(Platforms platform) {
        Platform = platform;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

}
