package main.Java.com.sotflond.POO.registroAlumno;

public class registroAlumno {

  public static void main(String[] args) {
      Alumno alumno1 = new Alumno();
      alumno1.agregarAlumno(5, "Juan", "Perez", 20);
      System.out.println(alumno1);;
      alumno1.asignarCalificacion(3.5);
      alumno1.asignarCalificacion(4.5);
      alumno1.asignarCalificacion(5.5);
      System.out.println(alumno1.calcularPromedio());
      System.out.println("--------");
      Alumno alumno2 = new Alumno();
      alumno2.agregarAlumno(3, "Raul", "Gonzalez", 22);
      System.out.println(alumno2);;
      alumno2.asignarCalificacion(4.2);
      alumno2.asignarCalificacion(3.8);
      alumno2.asignarCalificacion(5.6);
      System.out.println(alumno2.calcularPromedio());
      System.out.println("--------");
  }
}
