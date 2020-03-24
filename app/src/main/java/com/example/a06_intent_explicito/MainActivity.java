package com.example.a06_intent_explicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarActivity(View view) {
        //Código necesario para iniciar la actividad de DatosActivity (Intent explicito)

        Intent intentDatos = new Intent(this, DatosActivity.class);

        //Para pasar datos a otra actividad
        intentDatos.putExtra("numero",5);
        intentDatos.putExtra("nombre","Bea");

        startActivity(intentDatos);
    }
}
