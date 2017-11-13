/**
 * Created by StasMaster on 06.11.17.
 */
public enum Platforms {
    PC("Windows"), MAC("MacOS"), LINUX("Linux");

    private String name;

    Platforms(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }



}
