package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Ingresa tu primer valor (debe ser un número entero):");
        String inputB = JOptionPane.showInputDialog("Ingresa tu segundo valor (debe ser un número entero):");

        try {
            int numA = Integer.parseInt(inputA);
            int numB = Integer.parseInt(inputB);

            int sum = numA + numB;
            int res = numA - numB;
            int mul = numA * numB;
            int div = numA / numB;

            JOptionPane.showMessageDialog(null, "La suma de los dos números es: " + sum);
            JOptionPane.showMessageDialog(null, "La resta de los dos números es: " + res);
            JOptionPane.showMessageDialog(null, "La multiplicacion de los dos números es: " + mul);
            JOptionPane.showMessageDialog(null, "La division de los dos números es: " + div);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, " Ingresa valores enteros válidos.");
        }
    }
}

