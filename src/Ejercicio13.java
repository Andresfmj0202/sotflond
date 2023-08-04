import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ejercicio13 {

    public static void main(String[]arg){
        String inputA = JOptionPane.showInputDialog("Ingresa tu valor (debe ser un número decimal):");
        String inputB = JOptionPane.showInputDialog("Ingresa en cuanto decimales quieres redondear");

        float numA = Float.parseFloat(inputA);
        int numB = Integer.parseInt(inputB);

        double resultado = redondear(numA, numB);

        JOptionPane.showMessageDialog(null,"Resultado redondeado: " + resultado);
    }

    public static double redondear(float numA, int numB) {
        BigDecimal bd = new BigDecimal(numA);
        bd = bd.setScale(numB, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
