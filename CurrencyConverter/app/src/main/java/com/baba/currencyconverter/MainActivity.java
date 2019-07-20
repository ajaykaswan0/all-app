package com.baba.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button dolar,aud,eur,taka,rial,dinar,yuan,yen,ruble;
    double D,convertValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText inr = findViewById(R.id.inr);
        final EditText result = findViewById(R.id.convert);
        ButtonId();

        dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 69.04;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        aud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 48.32;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 78.46;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        taka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 0.82;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 10.04;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        rial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 18.41;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 227.50;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b= 0.64;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = inr.getText().toString();
                if (a.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter valid input",Toast.LENGTH_SHORT);
                    toast.show();
                    inr.setText("");
                }
                else{
                    double b = 1.09;
                    D = Double.parseDouble(inr.getText()+"");
                    convertValue = D/b;
                    result.setText(String.valueOf(convertValue));
                }

            }
        });



    }
    void ButtonId(){
        dolar= findViewById(R.id.DOLAR);
        aud = findViewById(R.id.AUD);
        eur =  findViewById(R.id.EUR);
        taka =  findViewById(R.id.TAKA);
        rial =  findViewById(R.id.RIAL);
        dinar =  findViewById(R.id.DINAR);
        yuan =  findViewById(R.id.YUAN);
        yen =  findViewById(R.id.YEN);
        ruble =  findViewById(R.id.RUBLE);
    }
}
