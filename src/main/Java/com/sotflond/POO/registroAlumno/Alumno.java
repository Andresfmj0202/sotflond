package main.Java.com.sotflond.POO.registroAlumno;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private List<Double> calificaciones = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.calificaciones = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //metodo para agregar los datos
    public void agregarAlumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;


    }
//metodo para mostrar los datos
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + getId()+
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                '}';
    }
    public void asignarCalificacion(double qualification) {
        this.calificaciones.add(qualification);

    }
    public double calcularPromedio(){
        if (calificaciones.isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        for (double qualification : calificaciones) {
            suma += qualification;
        }

        return suma / calificaciones.size();
    }

}
