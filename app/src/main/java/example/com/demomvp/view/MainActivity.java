package example.com.demomvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import example.com.demomvp.R;
import example.com.demomvp.presenter.LoginPresenterImp;

public class MainActivity extends Activity implements LoginView, View.OnClickListener {

    Button buttonOne, buttonTwo, btnLogin;
    EditText edtU, edtP;
    LoginPresenterImp loginPresenter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter = new LoginPresenterImp(this);

        findViewByIds();

    }

    private void findViewByIds() {
        buttonOne = (Button) findViewById(R.id.btnOne);
        buttonTwo = (Button) findViewById(R.id.btnTwo);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        edtP = (EditText) findViewById(R.id.edtP);
        edtU = (EditText) findViewById(R.id.edtU);


    }


    @Override
    public void LoginSuccess() {
        Toast.makeText(this, "LoginSuccess", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void LoginFailed() {
        Toast.makeText(this, "LoginFailed", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPassEmpty() {
        Toast.makeText(this, "onPassEmpty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUserEmpty() {
        Toast.makeText(this, "onUserEmpty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:

                loginPresenter.doLoginnnn(edtU.getText().toString(), edtP.getText().toString());
                break;
            default:
            //break;
        }
    }
}
