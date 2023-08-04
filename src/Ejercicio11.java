import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[]arg){
        String inputA = JOptionPane.showInputDialog("Ingrese la longitud del primer lado del triángulo:");
        String inputB = JOptionPane.showInputDialog("Ingrese la longitud del segundo lado del triángulo:");
        String inputC = JOptionPane.showInputDialog("Ingrese la longitud del tercer lado del triángulo:");

        int a = Integer.parseInt(inputA);
        int b = Integer.parseInt(inputB);
        int c = Integer.parseInt(inputC);


        int s = (a + b + c) / 2;

        // formula heron Área = √(s × (s - a) × (s - b) × (s - c))
        // el math.sqrt es para sacar la raiz
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
    }

}
