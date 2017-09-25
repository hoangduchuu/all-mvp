package example.com.demomvp.main;

/**
 * Created by hoang on 9/22/17.
 */

public interface MainMVP {
    interface View {
        void showToastMessage(User user);

        void showToastMessagePhatNua();


    }

    interface Presenter {
        void clickedButtonShowMessage();

        void clickedButtonShowMessagePhatnua();
    }
}
