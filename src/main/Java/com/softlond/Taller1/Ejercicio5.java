package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Ingresa tu primer valor (debe ser un número entero):");
        String inputB = JOptionPane.showInputDialog("Ingresa tu segundo valor (debe ser un número entero):");

        try {
            int numA = Integer.parseInt(inputA);
            int numB = Integer.parseInt(inputB);

            String verificar = (numA > numB)?numA + " es mayor":numB + " es mayor";

            JOptionPane.showMessageDialog(null,  verificar);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, " Ingresa valores enteros válidos.");
        }
    }
}
