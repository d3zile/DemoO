package com.example.demoo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
    EditText pass1, pass2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

    }

    public void onClickRege (View view) {
        EditText pass1 = (EditText)findViewById(R.id.pass1);
        EditText pass2 = (EditText)findViewById(R.id.pas);

        TextView tview = (TextView)findViewById(R.id.pas1);
        TextView tview1 = (TextView)findViewById(R.id.pas2);
        String result = pass1.getText().toString();
        String result1 = pass2.getText().toString();
        tview.setText(result);
        tview1.setText(result1);

    if (pass1.length()==pass2.length()){
        Toast.makeText(this, "Пароли совподают", Toast.LENGTH_SHORT).show();

    }
else
   {
        Toast.makeText(this, "Пароли не совподают", Toast.LENGTH_SHORT).show();
   }
    }


}
