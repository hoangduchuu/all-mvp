package example.com.demomvp.intoractor;

/**
 * Created by hoang on 9/26/17.
 */

public class LoginInteractorImp implements LoginInteractor {
    @Override
    public void doLogin(String u, String p, LoginCallback callback) {
        if (u.equals("")) {
            callback.onUserEmpty();
            return;
        }
        if (p.equals("")) {
            callback.onPassEmpty();
            return;
        }
        if (u.equals("admin") && p.equals("admin")) {
            callback.LoginSuccess();
        } else {
            callback.LoginFailed();
        }
    }
}
