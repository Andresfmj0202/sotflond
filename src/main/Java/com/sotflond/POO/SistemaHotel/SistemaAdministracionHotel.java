package main.Java.com.sotflond.POO.SistemaHotel;

import javax.swing.*;

public class SistemaAdministracionHotel {
    public static void main(String[] args) {

        //Seleccionar el hotel
        Hotel hotel = new Hotel("Piso mojado", 10);
        Hotel hotel2 = new Hotel("Las cucarachas", 5);
        Hotel hotel3 = new Hotel("Se robaron las puertas", 7);
        String opcionHotel = JOptionPane.showInputDialog("Ingrese la opcion del hotel que quieres administrar"
                + "\n" + "1: " + hotel.getNombre() +
                "\n" + "2: " + hotel2.getNombre() +
                "\n" + "3: " + hotel3.getNombre());
        if (opcionHotel == null) {
            JOptionPane.showMessageDialog(null, "Opcion no valida intente nuevamente");
            opcionHotel = JOptionPane.showInputDialog("Ingrese la opcion del hotel que quieres administrar");
        }

        int opcionIntHotel = Integer.parseInt(opcionHotel);

        Hotel opcionHotelElegido = null;

        if (opcionIntHotel == 1) {
            opcionHotelElegido = hotel;
        } else if (opcionIntHotel == 2) {
            opcionHotelElegido = hotel2;
        } else if (opcionIntHotel == 3) {
            opcionHotelElegido = hotel3;
        }
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Administracion de Hotel \n"
                + opcionHotelElegido.getNombre());

        JOptionPane.showMessageDialog(null, "Creando Cliente");
        String nombreEmpresa = JOptionPane.showInputDialog("ingrese el nombre de la empresa");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente");
        Cliente cliente = new Cliente(nombreEmpresa, nombre, cedula);
        JOptionPane.showMessageDialog(null,
                "Cliente creado: \n" + cliente.getNombreEmpresa()
                        + "\n" + cliente.getNombre()
                        + "\n" + cliente.getCedula() +
                        "\n"
        );

        Reserva reserva = null;

        String menu;
        do {
            menu = JOptionPane.showInputDialog(
                    "Ingresa el proceso que quieras realizar:\n" +
                            "1. Mostrar habitaciones\n" +
                            "2. Reservar una habitacion\n" +
                            "3. Liberar una habitacion\n" +
                            "exit: Salir del programa"
            );

            if (menu == null) {
                JOptionPane.showMessageDialog(null, "Opcion no valida. Intente nuevamente.");
            } else {
                switch (menu) {
                    case "1":
                        opcionHotelElegido.mostrarHabitaciones();
                        break;

                    case "2":
                        String opcion = JOptionPane.showInputDialog("Ingrese el numero de habitacion que quieres reservar");
                        int numeroHabitacion = Integer.parseInt(opcion);

                        reserva = new Reserva(1, opcionHotelElegido, numeroHabitacion, cliente);

                        if (opcionHotelElegido.verificarDisponibilidad(numeroHabitacion)) {
                            JOptionPane.showMessageDialog(null,
                                    "La habitación " + numeroHabitacion + " está disponible para reservar.");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La habitación " + numeroHabitacion + " está reservada.");
                        }
                        // ocupar una habitacion
                        JOptionPane.showMessageDialog(null, reserva.ocuparHabitacion());

                        break;

                    case "3":
                        // liberar una habitacion
                        opcion = JOptionPane.showInputDialog("Ingrese el numero de habitacion que quieres liberar");
                        numeroHabitacion = Integer.parseInt(opcion);


                        JOptionPane.showMessageDialog(null,
                                reserva.liberarHabitacion(numeroHabitacion));

                        //ocupar una habitacion que no esta reservada al liberar
                        String verificar = JOptionPane.showInputDialog("la quieres ocupar Y/N");
                        if (verificar.equals("Y")){
                            JOptionPane.showMessageDialog(null,
                                    reserva.OcuparHabitacionLiberada(numeroHabitacion));
                        }else {
                            JOptionPane.showMessageDialog(null, "proceso terminado");
                        }

                        break;

                    case "exit":
                        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida. Intente nuevamente.");
                        break;
                }
            }
        } while (!menu.equals("exit"));
    }
}
