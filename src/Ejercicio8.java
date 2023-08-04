import javax.swing.*;
import java.util.Random;

public class Ejercicio8 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(101); // Genera un número entre 0 y 100

        System.out.println(randomInt);

        String input;
        int numA;

        do {
            input = JOptionPane.showInputDialog("Introduce un número para adivinar el valor oculto");
            numA = Integer.parseInt(input);

            String value = (numA > randomInt) ? numA + " es mayor al número secreto.\nVuelve a intentar." : numA + " es menor al número secreto.\nVuelve a intentar.";
            JOptionPane.showMessageDialog(null, value);
        } while (randomInt != numA);

        JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número secreto.");
    }
}

