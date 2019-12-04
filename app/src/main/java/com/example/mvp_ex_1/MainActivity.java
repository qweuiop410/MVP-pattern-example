package com.example.mvp_ex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp_ex_1.Presenter.ILoginPresenter;
import com.example.mvp_ex_1.Presenter.LoginPresenter;
import com.example.mvp_ex_1.View.ILoginView;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements ILoginView {

    EditText EditText_email;
    EditText EditText_password;

    Button Button_Login;

    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init View
        EditText_email = findViewById(R.id.EditText_email);
        EditText_password = findViewById(R.id.EditText_password);
        Button_Login = findViewById(R.id.Button_Login);

        // Init
        loginPresenter = new LoginPresenter(this);

        // Event
        Button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.onLogin(EditText_email.getText().toString(),EditText_password.getText().toString());
            }
        });

    }

    @Override
    public void onLoginSuccess(String message) {
        Toasty.success(this,message,Toasty.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String message) {
        Toasty.error(this,message,Toasty.LENGTH_SHORT).show();
    }
}
