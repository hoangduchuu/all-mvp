package example.com.demomvp.main;

/**
 * Created by hoang on 9/22/17.
 */

public class MainPresenter implements MainMVP.Presenter {

    private MainMVP.View view;

    public MainPresenter(MainMVP.View view) {
        this.view = view;
    }

    @Override
    public void clickedButtonShowMessage() {
        User user = new User("nam", 11, "hoanh van thanh");


        view.showToastMessage(user);
    }

    @Override
    public void clickedButtonShowMessagePhatnua() {
        view.showToastMessagePhatNua();
    }
}
