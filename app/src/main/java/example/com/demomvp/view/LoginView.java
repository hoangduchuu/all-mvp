package example.com.demomvp.view;

/**
 * Created by hoang on 9/26/17.
 */

public interface LoginView {
    void LoginSuccess();

    void LoginFailed();

    void onPassEmpty();

    void onUserEmpty();
}
