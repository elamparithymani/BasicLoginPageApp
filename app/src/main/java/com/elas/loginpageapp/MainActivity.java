package com.elas.loginpageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivRememberMe;
    private Button btnLogin;
    private TextView tvRememberMetextview;
    private static boolean rememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        ivRememberMe = (ImageView) findViewById(R.id.ivRememberMe);
        ivRememberMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        rememberMe = !rememberMe;
                        ((ImageView) findViewById(R.id.ivRememberMe)).setImageResource(rememberMe ? R.drawable.greentick : R.drawable.greenwhite);
            }
        });
    }
}