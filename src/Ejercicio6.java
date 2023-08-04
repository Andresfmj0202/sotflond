import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("introduce un numero ");
         int numA = Integer.parseInt(input);

         if (numA > 0 ){
             JOptionPane.showMessageDialog(null,numA + " es un numero positivo");
         } else if (numA < 0) {
            JOptionPane.showMessageDialog(null,numA + " tu numero es negativo");
         }else {
             JOptionPane.showMessageDialog(null, "el valor es cero");
         }
    }
}
