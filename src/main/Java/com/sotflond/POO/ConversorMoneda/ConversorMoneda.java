package main.Java.com.sotflond.POO.ConversorMoneda;

public class ConversorMoneda {
    public static void main(String[] args) {
        Moneda moneda1 = new Moneda();
        moneda1.crearMoneda("Pesos", 25, 4.02, "euro");
        Moneda moneda2 = new Moneda();
        moneda2.crearMoneda("Dolares", 100, 1.2, "yuanes");

        System.out.println(moneda1);
        System.out.println(moneda2);

        System.out.println(moneda1.convertir());
        System.out.println(moneda2.convertir());

    }

}
