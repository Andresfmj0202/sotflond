package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio17 {
    public static void main(String[]arg){


    String inputA = JOptionPane.showInputDialog("Ingresa tu primer número entero positivo:");
    int numA = Integer.parseInt(inputA);
    String inputB = JOptionPane.showInputDialog("Ingresa un segundo número entero positivo:");
    int numB = Integer.parseInt(inputB);

        JOptionPane.showMessageDialog(null,"Los números primos en el rango de " + numA + " a " + numB + " son:");
    printPrimeNumbersInRange(numA, numB);


}

    // Función para verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Función para imprimir todos los números primos en un rango dado
    public static void printPrimeNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                JOptionPane.showMessageDialog(null,i + " ");
            }
        }
    }
}
