package main.Java.com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String [] arg){
        String input = JOptionPane.showInputDialog("Introduce el radio de tu circulo ''");
        float radio = Float.parseFloat(input);


        float area = (float) (Math.PI * radio * radio);


        float perimetro = (float) (2 * Math.PI * radio);

        JOptionPane.showMessageDialog(null,"Área del círculo: " + area);
        JOptionPane.showMessageDialog(null,"Perímetro del círculo: " + perimetro);
    }
}
