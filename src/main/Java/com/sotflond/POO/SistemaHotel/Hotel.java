package main.Java.com.sotflond.POO.SistemaHotel;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int cantidadHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();

        for (int i = 1; i <= cantidadHabitaciones; i++) {
            Habitacion habitacion = new Habitacion(i, this);
            habitaciones.add(habitacion);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void mostrarHabitaciones() {
        StringBuilder mensaje = new StringBuilder("Habitaciones del hotel '" + getNombre() + "':\n");

        for (Habitacion habitacion : habitaciones) {
            mensaje.append(habitacion).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
    public boolean verificarDisponibilidad(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return !habitacion.isReservada();
            }
        }
        return false;
    }

    public void actualizarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                habitacion.reservar();
            }
        }
    }





}