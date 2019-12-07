package modelo;

import java.util.Objects;

public class Alumno {

    private String numControl;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private byte edad;
    private byte semestre;
    private String carrera;

    //constructores

    public Alumno(){
    }

    public Alumno(String numControl, String nombre, String primerAp, String segundoAp, byte edad, byte semestre, String carrera){
        numControl = this.numControl;
        nombre = this.nombre;
        primerAp = this.primerAp;
        segundoAp = this.segundoAp;
        edad = this.edad;
        semestre = this.semestre;
        carrera = this.carrera;
    }

    //getters y setters

    public String getNumControl(){
        return numControl;
    }

    public void setNumControl(String numControl){
        this.numControl = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPrimerAp(){
        return primerAp;
    }
    public void setPrimerAp(String primerAp){
        this.primerAp = primerAp;
    }

    public String getSegundoAp(){
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp){
        this.segundoAp = segundoAp;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEdad(byte edad){
        this.edad = edad;
    }

    public byte getSemestre(){
        return semestre;
    }

    public void setSemestre(byte semestre){
        this.semestre = semestre;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    //toString

    @Override
    public String toString() {

        return "Alumno{" +
                "numControl='" + numControl + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerAp='" + primerAp + '\'' +
                ", segundoAp='" + segundoAp + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", carrera='" + carrera + '\'' +
                '}';

    }

    //compareTo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return edad == alumno.edad &&
                semestre == alumno.semestre &&
                Objects.equals(numControl, alumno.numControl) &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(primerAp, alumno.primerAp) &&
                Objects.equals(segundoAp, alumno.segundoAp) &&
                Objects.equals(carrera, alumno.carrera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numControl, nombre, primerAp, segundoAp, edad, semestre, carrera);
    }

    public int compareTo(String str){

        return 0;
    }

}
