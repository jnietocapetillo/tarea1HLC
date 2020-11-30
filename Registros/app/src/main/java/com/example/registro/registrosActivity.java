package com.example.registro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class registrosActivity extends AppCompatActivity {

    EditText nombre;
    EditText email;
    EditText edad;
    Button registrar, volver;
    private static final String expEmail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(expEmail);

    private int comprobar_datos(){
        boolean ok=false;
        String nom = nombre.getText().toString();
        String correo = email.getText().toString();
        int edadUsuario = Integer.parseInt(edad.getText().toString());
        int valor = 0;

            if (nom.compareTo("") == 0) {
                Toast.makeText(getApplicationContext(), "El nombre no puede estar vacío", Toast.LENGTH_LONG).show();
                valor=1;
            }
            if (edadUsuario < 18) {
                Toast.makeText(getApplicationContext(), "El usuario es Menor de edad. No puede registrarse. ", Toast.LENGTH_SHORT).show();
                valor=1;
            }

            if (!(pattern.matcher(correo)).matches()) {
                Toast.makeText(getApplicationContext(), "El correo es erróneo.", Toast.LENGTH_LONG).show();
                valor=2;
            }
            return valor;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);


        nombre = (EditText) findViewById(R.id.editNombre);
        email = (EditText) findViewById(R.id.editEmail);
        edad = (EditText) findViewById(R.id.editEdad);
        registrar = (Button) findViewById(R.id.btRegistrar);
        volver = (Button) findViewById(R.id.btVolver);

        nombre.setText("");
        email.setText("");
        edad.setText("");


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valor = comprobar_datos();
                if (valor == 0) {
                    Intent intent = getIntent();
                    setResult(RESULT_OK);
                    finish();
                }

            }
        });


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                setResult(RESULT_CANCELED);
                finish();
            }
        });

    }

}