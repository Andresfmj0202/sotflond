package main.Java.com.softlond.Taller1;

public class Ejercicio10 {
    public static void main(String[]arg){
        //fibonacci
        int numA = 0;
        int numB = 1;
        int cont ;
        for (int i = 0 ; i <20 ; i++){
            cont = numA + numB;
            numA = numB;
            numB = cont;

            System.out.println(numA);
        }
    }
}
