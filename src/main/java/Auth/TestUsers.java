package Auth;

/**
 * Created by StasMaster on 27.11.17.
 */
public class TestUsers {

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        MyFacebookUser myFb = new MyFacebookUser(user);
        User userOrigin = myFb;

    }
}
