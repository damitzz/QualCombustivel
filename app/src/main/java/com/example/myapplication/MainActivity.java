package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String combustivel = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Calculo(View v){
        String  alcool  = (((EditText)findViewById(R.id.alcool)).getText().toString());
        String  gasolina  = (((EditText)findViewById(R.id.gasolina)).getText().toString());

        Double vAlcool = Double.parseDouble(alcool);
        Double vGasolina = Double.parseDouble(gasolina);
        Double res = vAlcool/vGasolina;

        String choice = "";

        if(res>=0.7){
            choice = "GASOLINA";
        }else{
            choice = "ALCOOL";
        }

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(combustivel, choice);


        startActivity(intent);
        finish();

    }

}