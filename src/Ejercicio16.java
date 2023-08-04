import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[]arg){
        String input = JOptionPane.showInputDialog("ingresa hasta que serie se muestre el fibonacci");
        int rep = Integer.parseInt(input);
        int cont ;
        int numA = 0;
        int numB = 1;

        for (int i = 0 ; i < rep ; i++){
            cont = numA + numB;
            numA = numB;
            numB = cont;

            JOptionPane.showMessageDialog(null,"la serie es:" + numA);
        }
    }
}


