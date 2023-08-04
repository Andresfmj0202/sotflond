import javax.swing.*;

public class Ejercicio7 {

    public static void main(String[]arg){
        String input = JOptionPane.showInputDialog("ingresa un valor entero positivo");
        int numA = Integer.parseInt(input);

        while (numA < 0 ){
            JOptionPane.showMessageDialog(null,"tu valor no es valido intenta de nuevo");
             input = JOptionPane.showInputDialog("ingresa un valor entero positivo");
            numA = Integer.parseInt(input);
        }

        for (int i = 1; i <= 10; i++) {
            int mul = numA * i;
            JOptionPane.showMessageDialog(null,
                    "su tabla de multiplicacion es \n" +numA + " * " + i + " = " + mul );
        }
    }
}
