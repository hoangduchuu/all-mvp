package example.com.demomvp.presenter;

import example.com.demomvp.intoractor.LoginCallback;
import example.com.demomvp.intoractor.LoginInteractorImp;
import example.com.demomvp.view.LoginView;

/**
 * Created by hoang on 9/26/17.
 */

public class LoginPresenterImp implements LoginPresenter, LoginCallback {
    LoginInteractorImp loginInteractorImp;
    private LoginView loginView;

    public LoginPresenterImp(LoginView loginView) {
        this.loginInteractorImp = new LoginInteractorImp();
        this.loginView = loginView;
    }

    @Override
    public void doLoginnnn(String user, String pass) {
        loginInteractorImp.doLogin(user, pass, this);
    }

    @Override
    public void LoginSuccess() {
        loginView.LoginSuccess();
    }

    @Override
    public void LoginFailed() {
        loginView.LoginFailed();
    }

    @Override
    public void onPassEmpty() {
        loginView.onPassEmpty();
    }

    @Override
    public void onUserEmpty() {
        loginView.onUserEmpty();

    }
}
