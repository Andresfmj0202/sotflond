package main.Java.com.sotflond.POO.SistemaHotel;

public class Reserva extends Habitacion {

    private int numeroHabitacion;
    private Cliente cliente;

    public Reserva(int numero, Hotel hotel, int numeroHabitacion, Cliente cliente) {
        super(numero, hotel);
        this.numeroHabitacion = numeroHabitacion;
        this.cliente = cliente;
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

    public String ocuparHabitacion() {
        if (!reservada) {
            reservada = true;
            return "La habitación " + numeroHabitacion + " se ha reservado a: \n" +
                    cliente.getNombre() + " con Cedula " + cliente.getCedula() + "\n" +
                    "de la empresa " + cliente.getNombreEmpresa();
        }
        return "La habitación " + numeroHabitacion + " ya está reservada";
    }
    public String MostrarReserva() {
        return "La habitación " + numeroHabitacion + " se ha reservado a: \n" +
                cliente.getNombre() + " con Cedula " + cliente.getCedula() + "\n" +
                "de la empresa " + cliente.getNombreEmpresa();

    }
    public String liberarHabitacion() {
        if (reservada) {
            reservada = false;
            return "La habitación " + numeroHabitacion + " se ha liberado";
        }
        return "La habitación " + numeroHabitacion + " no está reservada";
    }
}
