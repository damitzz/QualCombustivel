package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        //imageView.setImageResource(R.drawable.alcool);

        Intent intent = getIntent();
        String res = intent.getStringExtra(MainActivity.combustivel);
        if(Objects.equals(res, "ALCOOL")){
            imageView.setImageResource(R.drawable.alcool);
        }
        TextView resultado = findViewById(R.id.resultado);

        resultado.setText(res);
    }


}