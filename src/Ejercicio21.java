import javax.swing.JOptionPane;
public class Ejercicio21 {
        public static void main(String[] args) {
            String inputString = JOptionPane.showInputDialog(null, "Ingrese una cadena de texto:");
            if (inputString != null && !inputString.isEmpty()) {
                String letterInput = JOptionPane.showInputDialog(null, "Ingrese una letra:");
                if (letterInput != null && !letterInput.isEmpty() && letterInput.length() == 1) {
                    char targetLetter = letterInput.charAt(0);
                    int occurrences = countLetterOccurrences(inputString, targetLetter);
                    JOptionPane.showMessageDialog(null,
                            "La letra '" + targetLetter + "' aparece " + occurrences + " veces en la cadena.");
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar una letra válida.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresó una cadena de texto válida.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        public static int countLetterOccurrences(String str, char targetLetter) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetLetter) {
                    count++;
                }
            }
            return count;
        }
}
