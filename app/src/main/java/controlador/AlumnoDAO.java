package controlador;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.Gravity;
import android.widget.Toast;

import modelo.Alumno;

public class AlumnoDAO extends SQLiteOpenHelper {

    //Constantes que definirán la estructura de la BD

    private static final int VERSION_BD = 1;

    private static final String NOMBRE_BD = "Escuela";

    private static final String TABLA_ALUMNOS = "Alumnos";

    private static final String CAMPO_NUM_CONTROL = "Num_Control";
    private static final String CAMPO_NOMBRE = "Nombre";
    private static final String CAMPO_PRIMER_AP = "Primer_Ap";
    private static final String CAMPO_SEGUNDO_AP = "Segundo_Ap";
    private static final String CAMPO_EDAD = "Edad";
    private static final String CAMPO_SEMESTRE = "Semestre";
    private static final String CAMPO_CARRERA = "Carrera";

    //CREATE TABLE Alumnos(Num_Control TEXT

    private static final String CREACION_TABLA_ALUMNOS = "CREATE TABLE "+ TABLA_ALUMNOS+"("+CAMPO_NUM_CONTROL+" TEXT, "+CAMPO_NOMBRE+" TEXT, "+
            CAMPO_PRIMER_AP+" TEXT, "+CAMPO_SEGUNDO_AP+" TEXT, "+CAMPO_EDAD+" INTEGER, "+CAMPO_SEMESTRE+" INTEGER, "+CAMPO_CARRERA+" TEXT);";


    public AlumnoDAO(Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREACION_TABLA_ALUMNOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //para actualizaar ESQUEMA de la BD
    }

    //---------------------------- METODOS para ABCC ------------------------------
    public boolean agregarAlumno (Alumno a){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(CAMPO_NUM_CONTROL, a.getNumControl());
        cv.put(CAMPO_NOMBRE, a.getNombre());
        cv.put(CAMPO_PRIMER_AP, a.getPrimerAp());
        cv.put(CAMPO_SEGUNDO_AP, a.getSegundoAp());
        cv.put(CAMPO_EDAD, a.getEdad());
        cv.put(CAMPO_SEMESTRE, a.getSemestre());
        cv.put(CAMPO_CARRERA, a.getCarrera());

        long res = db.insert(TABLA_ALUMNOS, null, cv);

        return (res==-1) ? false : true;
    }
}
