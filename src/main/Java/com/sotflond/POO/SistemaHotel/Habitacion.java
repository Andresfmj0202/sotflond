package main.Java.com.sotflond.POO.SistemaHotel;

public class Habitacion extends Hotel{
    private int numero;
    boolean reservada;

    public Habitacion(int numero, Hotel hotel) {
        super(hotel.getNombre(), hotel.getHabitaciones().size());
        this.numero = numero;
        this.reservada = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void reservar() {
        reservada = true;
    }

    public void liberar() {
        reservada = false;
    }

    public String toString() {

        String estadoReserva = reservada ? "Reservada" : "Disponible";

        return "El hotel " + getNombre() + " tiene la Habitación " + numero + " - Estado: " + estadoReserva;
    }


}