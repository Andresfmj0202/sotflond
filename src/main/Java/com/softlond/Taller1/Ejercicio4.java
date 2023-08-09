package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String [] arg){
        String input = JOptionPane.showInputDialog("ingresa tu edad");

        try {
            int edad = Integer.parseInt(input);

            String verificar = (edad > 18 ) ? "es mayor de edad" : "es menor de edad" ;

            JOptionPane.showMessageDialog(null, verificar);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, " Ingresa valores enteros válidos.");
        }
    }
}
