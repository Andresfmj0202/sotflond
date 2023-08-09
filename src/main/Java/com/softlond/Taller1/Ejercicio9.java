package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[]arg) {
        String input = JOptionPane.showInputDialog("ingresa un valor entero positivo");
        int numA = Integer.parseInt(input);

        while (numA < 0) {
            JOptionPane.showMessageDialog(null, "tu valor no es valido intenta de nuevo");
            input = JOptionPane.showInputDialog("ingresa un valor entero positivo");
            numA = Integer.parseInt(input);
        }


        int factorial = 1;

        for (int i = 1; i <= numA; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numA + " es: " + factorial);
    }
}
