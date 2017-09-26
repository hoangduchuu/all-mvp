package example.com.demomvp.intoractor;

/**
 * Created by hoang on 9/26/17.
 */

public interface LoginCallback {
    void LoginSuccess();

    void LoginFailed();

    void onPassEmpty();

    void onUserEmpty();
}
