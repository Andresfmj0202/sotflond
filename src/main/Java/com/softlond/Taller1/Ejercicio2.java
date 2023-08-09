package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] arg){
        String input = JOptionPane.showInputDialog("Ingresa un valor (debe ser un número entero):");

        try {

            int num = Integer.parseInt(input);

            String result = (num % 2 == 0) ? "es un par" : "es un impar";

            JOptionPane.showMessageDialog(null,"El número " + num + " " + result + ".");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, " Ingresa valores enteros válidos.");
        }
    }
}
