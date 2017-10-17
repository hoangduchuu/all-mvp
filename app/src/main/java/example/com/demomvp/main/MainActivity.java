package example.com.demomvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import es.dmoral.toasty.Toasty;
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

        buttonOne.setOnClickListener(v -> {
            // body
            Log.e("abac", "abc");
        });

    }


    @Override
    public void showToastMessage(User user) {
        Toast.makeText(this, "hello: " + user.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToastMessageAgain() {
        Toast.makeText(this, "Toast lan hai roi em", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showList(List<String> userList) {
        Log.d("abc", "abc");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, userList);
        listView.setAdapter(adapter);
        Toasty.success(this, "Success!", Toast.LENGTH_LONG, true).show();

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                presenter.clickedButtonShowMessage();
                break;
            case R.id.btnTwo:
//                presenter.clickedButtonShowMessageAgain();
                presenter.getListUSer();

                break;
            default:
                break;
        }
    }
}
