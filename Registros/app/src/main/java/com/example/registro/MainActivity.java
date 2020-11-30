package com.example.registro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button registrar, listar;
    boolean irListado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrar = (Button) findViewById(R.id.btRegistro);
        listar = (Button) findViewById(R.id.btListar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), registrosActivity.class);
                startActivityForResult(i,0);
            }
        });

        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (irListado) {
                    Intent i = new Intent(getApplicationContext(), listarActivity.class);
                    startActivity(i);
                }else
                    Toast.makeText(getApplicationContext(),"Debe registrarse antes",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {// para llevar informacion para atras, recoge el mensaje de la actividad de delante
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            irListado = true;
        }
        else
            Toast.makeText(getApplicationContext(),"Debe registrarse antes para listar",Toast.LENGTH_SHORT).show();

    }

}