package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio12 {
    public static void  main(String[]arg){
        String input = JOptionPane.showInputDialog("ingresa un valor entero positivo");
        int num = Integer.parseInt(input);

        boolean esPrimo = numeroPrimo(num);

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, num + " es un numero primo.");
        } else {
            JOptionPane.showMessageDialog(null, num + " no es un numero primo.");
        }
    }

    // verificar
    public static boolean numeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
