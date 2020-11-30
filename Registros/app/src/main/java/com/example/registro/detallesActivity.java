package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detallesActivity extends AppCompatActivity {

    TextView textoNombre, textoDesc, textoTipo;
    ImageView imagen;
    String nombre, descrip,tipoActor;
    int imagenActor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        textoNombre = (TextView) findViewById(R.id.txtNombreActor);
        textoDesc = (TextView) findViewById(R.id.txtDescripcion);
        textoTipo = (TextView) findViewById(R.id.txtTipo);
        imagen = (ImageView) findViewById(R.id.imgView);


        nombre = getIntent().getStringExtra("nombre");
        descrip = getIntent().getStringExtra("descripcion");
        tipoActor = getIntent().getStringExtra("tipo");
        imagenActor = getIntent().getIntExtra("imagen",0);

        textoNombre.setText(nombre);
        textoDesc.setText(descrip);
        textoTipo.setText(tipoActor);
        imagen.setImageResource(imagenActor);

    }
}