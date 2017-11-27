package auth;

/**
 * Created by StasMaster on 27.11.17.
 */
public class MyFacebookUser implements User {

    private FacebookUser user;

    public MyFacebookUser( FacebookUser user) {
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
