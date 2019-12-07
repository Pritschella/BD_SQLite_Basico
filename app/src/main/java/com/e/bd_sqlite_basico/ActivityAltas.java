package com.e.bd_sqlite_basico;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.bd_sqlite_basico.R;

import controlador.AlumnoDAO;
import modelo.Alumno;

public class ActivityAltas extends Activity {

    EditText txtnumControl, txtNombre, txtPrimerAp, txtSegundoAp, txtEdad, txtSemestre, txtCarrera;
    Button Agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);
        //Agregar = (Button)findViewById(R.id.btnAltas);
        //Agregar.setOnClickListener(this);
        Agregar = findViewById(R.id.btnAltas);

        txtnumControl=findViewById(R.id.txtNumControlAltas);
        txtNombre=findViewById(R.id.txtNombreAltas);
        txtPrimerAp=findViewById(R.id.txtPrimerApAltas);
        txtSegundoAp=findViewById(R.id.txtSegundoApAltas);
        txtEdad=findViewById(R.id.txtEdadAltas);
        txtSemestre=findViewById(R.id.txtSemestreAltas);
        txtCarrera=findViewById(R.id.txtCarreraAltas);
    }

    public void Onclick(View v){


        final AlumnoDAO aa = new AlumnoDAO(this);

                Alumno a = new Alumno();
                a.setNumControl(txtnumControl.getText().toString());
                a.setNombre(txtNombre.getText().toString());
                a.setPrimerAp(txtPrimerAp.getText().toString());
                a.setSegundoAp(txtSegundoAp.getText().toString());
                a.setEdad((Byte.valueOf(txtEdad.getText().toString())) );
                a.setSemestre(Byte.valueOf(txtSemestre.getText().toString()));
                a.setCarrera(txtCarrera.getText().toString());

                aa.agregarAlumno(a);
                Toast toast = Toast.makeText(ActivityAltas.this, aa.agregarAlumno(a)+" Mensaje 1", Toast.LENGTH_SHORT);
                toast.show();


    }
}
