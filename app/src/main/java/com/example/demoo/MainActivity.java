package com.example.demoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickReg (View view){
        Intent i = new Intent(MainActivity.this, Registration.class);
        startActivity(i);
        finish();
    }
    public void onClickVhod(View v) {
        EditText log = (EditText)findViewById(R.id.log);
        EditText pas = (EditText)findViewById(R.id.pas);


        if(log.getText().toString().equals("serk") && pas.getText().toString().equals("123")){
            Intent o = new Intent(MainActivity.this, Menu.class);
            startActivity(o);
            finish();

        }
        else
        {
            Toast.makeText(this, "Неправильно введен пароль или логин", Toast.LENGTH_SHORT).show();
        }
    }
}

