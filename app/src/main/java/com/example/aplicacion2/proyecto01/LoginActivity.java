package com.example.aplicacion2.proyecto01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogIn);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText user = (EditText) findViewById(R.id.User);
                EditText pass = (EditText) findViewById(R.id.Pass);

                if(user.getText().toString().equals("admin") && pass.getText().toString().equals("123456")){
                    Intent intent = new Intent(getApplicationContext(), CurriculumActivity.class);
                    startActivity(intent);
                } else {

                }
            }
        });

    }
}
