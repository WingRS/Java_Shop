package Shop;

/**
 * Created by StasMaster on 06.11.17.
 */
public enum Genre {
    ACTION("action"), MOBA("moba"), SIMULATION("simulation");

    private String name;

    Genre(String s) {
        this.name = s;
    }


    @Override
    public String toString() {
        return name;
    }



    public String getName() {
        return name;
    }


}

