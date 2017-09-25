package example.com.demomvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import example.com.demomvp.R;

public class MainActivity extends AppCompatActivity implements MainMVP.View, View.OnClickListener {
    MainMVP.Presenter presenter;

    Button buttonOne, buttonTwo;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);

        findViewByIds();

    }

    private void findViewByIds() {
        buttonOne = (Button) findViewById(R.id.btnOne);
        buttonTwo = (Button) findViewById(R.id.btnTwo);
        listView = (ListView) findViewById(R.id.lv);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
    }


    @Override
    public void showToastMessage(User user) {
        Toast.makeText(this, "hello: " + user.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToastMessagePhatNua() {
        Toast.makeText(this, "Toast lan hai roi em", Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                presenter.clickedButtonShowMessage();
                break;
            case R.id.btnTwo:
                presenter.clickedButtonShowMessagePhatnua();
                break;
            default:
                break;
        }
    }
}
