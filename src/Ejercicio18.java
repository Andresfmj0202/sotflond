import javax.swing.*;

public class Ejercicio18 {
    public static void main(String[]arg){
        int passwordLength = 8;

        String randomPassword = generateRandomPassword(passwordLength);
        JOptionPane.showMessageDialog(null,"Contraseña aleatoria: " + randomPassword);
    }

    public static String generateRandomPassword(int length) {

        String letras = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "0123456789";


        String allCharacters =  letras + digitos ;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}


