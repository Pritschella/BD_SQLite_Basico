package com.e.bd_sqlite_basico;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirActivities(View v){

        switch (v.getId()){
            case R.id.btn_agregar: Intent i = new Intent(this, ActivityAltas.class);
                startActivity(i);
                break;

            case R.id.btn_eliminar: i = new Intent(this, ActivityBajas.class);
                startActivity(i);
                break;

            case R.id.btn_modificar: i = new Intent(this, ActivityCambios.class);
                startActivity(i);
                break;

            case R.id.btn_buscar: i = new Intent(this, ActivityConsultas.class);
                startActivity(i);
                break;

                default:
                    break;
        }




    }
}//Class
