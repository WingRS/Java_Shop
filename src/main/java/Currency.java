/**
 * Created by StasMaster on 13.11.17.
 */
public enum Currency {
    UAH("uah"), USD("USD"),POUND("British Pound");

    String name;

    Currency(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name;
    }


}
