package main.Java.com.sotflond.POO.SistemaHotel;

import java.util.ArrayList;
import java.util.List;

public class Reserva extends Habitacion {

    private int numeroHabitacion;
    private Cliente cliente;
    private boolean reservada;
    public List<Reserva> reservas;

    public Reserva(int numero, Hotel hotel, int numeroHabitacion, Cliente cliente) {
        super(numero, hotel);
        this.numeroHabitacion = numeroHabitacion;
        this.cliente = cliente;
        reservas = new ArrayList<>();

    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public String ocuparHabitacion(Reserva reserva) {
        if (!reservada) {
            reservada = true;
            String mensaje = "La habitación " + getNumeroHabitacion() + " se ha reservado a: \n" +
                    cliente.getNombre() + " con Cedula " + cliente.getCedula() + "\n" +
                    "de la empresa " + cliente.getNombreEmpresa();
            reservas.add(reserva);
            System.out.println(reservas);
            return mensaje;
        }
        return "La habitación " + getNumeroHabitacion() + " ya está reservada";
    }

    public String liberarHabitacion(int numeroHabitacion, Reserva reserva) {
       if (!reservada){
           String mensaje = "La habitación " + numeroHabitacion + " se ha liberado";
           reservas.remove(reserva);
           return mensaje;
       }

       return "La habitación " + numeroHabitacion + " no cuenta con una reserva \n"
               + " y no se puede liberar \n" + "quiere reservar esta habitación \n";
    }

    public String OcuparHabitacionLiberada(int numeroHabitacion, Reserva reserva) {
        String ocupar = "La habitación " + numeroHabitacion + " se ha reservado a: \n" +
                getCliente().getNombre() + " con Cedula " + getCliente().getCedula() + "\n" +
                "de la empresa " + getCliente().getNombreEmpresa();
        reservas.add(reserva);
        System.out.println(reservas);
        return ocupar;
    }

    //manejo de reservas realizadas

    public boolean modificarEstado(Reserva reserva) {
        if (reservas.contains(reserva)) { // Asumiendo que 'reservas' es la lista de reservas en la clase 'Hotel'
            reserva.setReservada(!reserva.isReservada()); // Cambiar estado usando el método setter
            return true;
        }
        return false;
    }


}

