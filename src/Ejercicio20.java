import javax.swing.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto:");

        if (inputString != null && !inputString.isEmpty()) {
            String reversedString = reverse(inputString);
            JOptionPane.showMessageDialog(null, "Cadena invertida: " + reversedString);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó una cadena de texto válida.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

