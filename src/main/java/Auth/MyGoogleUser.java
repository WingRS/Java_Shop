package Auth;

/**
 * Created by StasMaster on 27.11.17.
 */
public class MyGoogleUser implements User {

    private User user;

    public MyGoogleUser(User user) {
        this.user = user;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getUserCity() {
        return null;
    }
}
