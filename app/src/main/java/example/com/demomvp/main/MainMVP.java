package example.com.demomvp.main;

import java.util.List;

/**
 * Created by hoang on 9/22/17.
 */

public interface MainMVP {
    interface View {
        void showToastMessage(User user);

        void showToastMessageAgain();

        void showList(List<String> userList);


    }

    interface Presenter {
        void clickedButtonShowMessage();

        void clickedButtonShowMessageAgain();

        void getListUSer();


    }
}
