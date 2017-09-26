package example.com.demomvp.intoractor;

/**
 * Created by hoang on 9/26/17.
 */

public interface LoginInteractor {
    void doLogin(String u, String p, LoginCallback callback);
}
