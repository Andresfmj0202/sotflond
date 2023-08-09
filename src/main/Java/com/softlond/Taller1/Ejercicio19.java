package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio19 {
    public static void main(String[]arg){
    String input = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto:");

        if (input != null && !input.isEmpty()) {

        String upperCaseText = input.toUpperCase();
        String lowerCaseText = input.toLowerCase();


        String message = "Texto ingresado: " + input + "\n"
                + "En mayúsculas: " + upperCaseText + "\n"
                + "En minúsculas: " + lowerCaseText;

        JOptionPane.showMessageDialog(null, message);
    } else {
        JOptionPane.showMessageDialog(null, "No se ingresó una cadena de texto válida.", "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
}
