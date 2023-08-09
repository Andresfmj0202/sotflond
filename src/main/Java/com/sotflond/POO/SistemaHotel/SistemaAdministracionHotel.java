package main.Java.com.sotflond.POO.SistemaHotel;

import javax.swing.*;

public class SistemaAdministracionHotel {
    public static void main(String[] args) {

        // registrar un nuevo cliente
        String nombreEmpresa = JOptionPane.showInputDialog("Ingresa el nombre de la empresa");
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        String cedula = JOptionPane.showInputDialog("Ingresa la cedula");
        Cliente cliente = new Cliente(nombreEmpresa, nombre, cedula);



        // despues de haber creado el cliente se mostrara las habitaciones
        Hotel hotel = new Hotel("Estelar", 10);

        hotel.mostrarHabitaciones();

        // reservar una habitacion
        String opcion = JOptionPane.showInputDialog("Ingrese el numero de habitacion que quieres reservar");
        int numeroHabitacion = Integer.parseInt(opcion);

        Reserva reserva = new Reserva(1, hotel, numeroHabitacion, cliente);

        if (hotel.verificarDisponibilidad(reserva.getNumeroHabitacion())) {
            JOptionPane.showMessageDialog(null,"La habitación " + reserva.getNumeroHabitacion() + " está disponible para reservar.");
        } else {
            JOptionPane.showMessageDialog(null,"La habitación " + reserva.getNumeroHabitacion() + " está reservada.");

        }
        // ocutar una habitacion
        JOptionPane.showMessageDialog(null, reserva.ocuparHabitacion());

        // liberar una habitacion
        JOptionPane.showMessageDialog(null, reserva.liberarHabitacion());


    }
}
