package main.Java.com.sotflond.POO.CALCULADORA;

public class Calculadora {
    private double valor1, valor2;

    public Calculadora() {
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double suma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double division(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public void Mostrar(){
        System.out.println("La suma es: " + suma(valor1 , valor2) );
        System.out.println("La resta es: " + resta(valor1 , valor2));
        System.out.println("La multiplicacion es: " + multiplicacion(valor1, valor2));
        System.out.println("La division es: " + division(valor1, valor2));
    }
}
