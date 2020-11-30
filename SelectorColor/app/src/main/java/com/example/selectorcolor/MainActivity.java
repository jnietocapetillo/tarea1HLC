package com.example.selectorcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar barraRoja, barraVerde, barraAzul;
    TextView nivelRojo, nivelVerde, nivelAzul,colorHexa;
    View panel;
    int rojo, verde, azul;
    String hexa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barraRoja = (SeekBar) findViewById(R.id.seekRojo);
        barraVerde = (SeekBar) findViewById(R.id.seekVerde);
        barraAzul = (SeekBar) findViewById(R.id.seekAzul);
        nivelRojo = (TextView) findViewById(R.id.txtPorRojo);
        nivelVerde = (TextView) findViewById(R.id.txtPorVerde);
        nivelAzul = (TextView) findViewById(R.id.txtPorAzul);
        panel = (View) findViewById(R.id.viewColor);
        colorHexa = (TextView) findViewById(R.id.txtHexa);
        rojo = 0;
        verde = 0;
        azul = 0;


        barraRoja.setProgressBackgroundTintList(ColorStateList.valueOf(Color.rgb(200, 14, 51)));

        barraVerde.setProgressBackgroundTintList(ColorStateList.valueOf(Color.rgb(76, 175, 80)));

        barraAzul.setProgressBackgroundTintList(ColorStateList.valueOf(Color.rgb(33, 150, 243)));

        colorHexa.setText("#" + Integer.toHexString(0) + Integer.toHexString(rojo) + Integer.toHexString(0) + Integer.toHexString(verde) + Integer.toHexString(0) + Integer.toHexString(azul));
        colorHexa.setTextColor(Color.rgb(rojo, verde, azul));


        barraRoja.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                nivelRojo.setText(String.valueOf(progress));
                rojo = progress;
                panel.setBackgroundColor(Color.rgb((int) rojo, (int) verde, (int) azul));
                ponerHexa();
                colorHexa.setTextColor(Color.rgb((int) rojo, (int) verde, (int) azul));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraVerde.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                nivelVerde.setText(String.valueOf(progress));
                verde = progress;
                panel.setBackgroundColor(Color.rgb((int) rojo, (int) verde, (int) azul));
                ponerHexa();
                colorHexa.setTextColor(Color.rgb((int) rojo, (int) verde, (int) azul));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        barraAzul.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                nivelAzul.setText(String.valueOf(progress));
                azul = progress;
                panel.setBackgroundColor(Color.rgb((int) rojo, (int) verde, (int) azul));
                ponerHexa();
                colorHexa.setTextColor(Color.rgb((int) rojo, (int) verde, (int) azul));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void ponerHexa (){
        if (rojo < 16)
            if (verde < 16)
                if (azul < 16)
                    colorHexa.setText("#" + Integer.toHexString(0) + Integer.toHexString(rojo) + Integer.toHexString(0) + Integer.toHexString(verde) + Integer.toHexString(0) + Integer.toHexString(azul));
                else
                    colorHexa.setText("#" + Integer.toHexString(0) + Integer.toHexString(rojo) + Integer.toHexString(0) + Integer.toHexString(verde) + Integer.toHexString(azul));
            else if (azul < 16)
                colorHexa.setText("#" + Integer.toHexString(0) + Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(0) + Integer.toHexString(azul));
            else
                colorHexa.setText("#" + Integer.toHexString(0) + Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(azul));
        else if (verde < 16)
            if (azul < 16)
                colorHexa.setText("#" + Integer.toHexString(rojo) + Integer.toHexString(0) + Integer.toHexString(verde) + Integer.toHexString(0) + Integer.toHexString(azul));
            else
                colorHexa.setText("#" + Integer.toHexString(rojo) + Integer.toHexString(0) + Integer.toHexString(verde) + Integer.toHexString(azul));
        else if (azul < 16)
            colorHexa.setText("#" + Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(0) + Integer.toHexString(azul));
        else
            colorHexa.setText("#" + Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(azul));
    }
}