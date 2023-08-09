package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio14 {

    public static void main(String[]arg){
        String input = JOptionPane.showInputDialog("Ingresa un número entero positivo:");
        int num = Integer.parseInt(input);

        boolean esPerfecto = esNumeroPerfecto(num);

        if (esPerfecto) {
            JOptionPane.showMessageDialog(null, num + " es un número perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, num + " NO es un número perfecto.");
        }
    }


    public static boolean esNumeroPerfecto(int num) {
        if (num <= 0) {
            return false;
        }

        int sumaDivisores = 0;


        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == num;
    }
}

