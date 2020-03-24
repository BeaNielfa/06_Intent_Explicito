package com.example.a06_intent_explicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        //Recogemos a través de un objeto Bundle los datos
        Bundle extras = getIntent().getExtras();

        //Lo almacenamos en variables
        int n = extras.getInt("numero");
        String nombre = extras.getString("nombre");

        //Imprimimos los valores a través de  un Toast
        Toast.makeText(this, "Número: "+n+" Nombre: "+ nombre, Toast.LENGTH_SHORT).show();
    }
}
