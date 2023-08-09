package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio15 {

    public static void main(String[]arg){
        String input = JOptionPane.showInputDialog("Ingresa un número entero:");
        String numInvertido = new StringBuilder(input).reverse().toString();
        String result = (input.equals(numInvertido))? "es capicula": "no es capicula";
        JOptionPane.showMessageDialog(null, result);
    }
}
