package example.com.demomvp.main;

import java.util.ArrayList;
import java.util.List;

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
    public void clickedButtonShowMessageAgain() {
        view.showToastMessageAgain();
    }

    @Override
    public void getListUSer() {
        List<String> users = new ArrayList<>();

        users.add("a");
        users.add("c");
        users.add("c");
        users.add("d");
        users.add("e");


        view.showList(users);

    }
}
