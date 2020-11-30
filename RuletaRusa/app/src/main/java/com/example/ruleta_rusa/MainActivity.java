package com.example.ruleta_rusa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    Button opc1, opc2, opc3, opc4, opc5, opc6, inicio;
    ImageView imagen;
    TextView jugador;
    int numero;
    boolean pulsado = false;
    int turno;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageView) findViewById(R.id.img);
        imagen.setImageResource(R.drawable.pensativo);
        jugador = (TextView) findViewById(R.id.txtJugador);


        opc1 = (Button) findViewById(R.id.bt1);
        opc2 = (Button) findViewById(R.id.bt2);
        opc3 = (Button) findViewById(R.id.bt3);
        opc4 = (Button) findViewById(R.id.bt4);
        opc5 = (Button) findViewById(R.id.bt5);
        opc6 = (Button) findViewById(R.id.bt6);
        inicio = (Button) findViewById(R.id.btIniciar);



        imagen.setImageResource(R.drawable.ruleta);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.pensativo);
                numero = (int)Math.floor(Math.random()*6+1) ;
                pulsado = true;
                jugador.setText("Turno Jugador 1"); turno = 1;
                opc1.setTextColor(Color.rgb(207,200,200));
                opc2.setTextColor(Color.rgb(207,200,200));
                opc3.setTextColor(Color.rgb(207,200,200));
                opc4.setTextColor(Color.rgb(207,200,200));
                opc5.setTextColor(Color.rgb(207,200,200));
                opc6.setTextColor(Color.rgb(207,200,200));
                inicio.setText("E N   J U E G O");inicio.setEnabled(false);

            }
        });

        opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 1) {
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc1.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno=2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno=1;
                        }
                        opc1.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });

        opc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 2) {
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc2.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno = 2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno = 1;
                        }
                        opc2.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });

        opc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 3) {
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc3.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno = 2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno = 1;
                        }
                        opc3.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });

        opc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 4){
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc4.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno = 2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno = 1;
                        }
                        opc4.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });

        opc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 5) {
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc5.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno = 2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno = 1;
                        }
                        opc5.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });

        opc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pulsado) {
                    if (numero == 6) {
                        if (turno == 1) jugador.setText("Ganador Jugador 2");
                        else jugador.setText("Ganador Jugador 1");
                        opc6.setTextColor(Color.RED);
                        imagen.setImageResource(R.drawable.acierto);
                        inicio.setEnabled(true);
                        inicio.setText("R  E  I  N  I  C  I  A  R");

                    }
                    else {
                        if (turno == 1){
                            jugador.setText("Turno Jugador 2");
                            turno = 2;
                        }
                        else{
                            jugador.setText("Turno Jugador 1");
                            turno = 1;
                        }
                        opc6.setTextColor(Color.GREEN);
                        imagen.setImageResource(R.drawable.alegre);

                    }
                }
            }
        });
  //      acerca.setOnClickListener(new View.OnClickListener() {
  //          @Override
  //          public void onClick(View v) {


            }
  //      });


  //  }
}

