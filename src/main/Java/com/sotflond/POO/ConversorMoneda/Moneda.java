package main.Java.com.sotflond.POO.ConversorMoneda;

public class Moneda {

    private String nombre;
    private int cantidad;
    private double tazaDeConversion;

    private String monedaDestino;

    public Moneda() {
    }

    public Moneda(String nombre, int cantidad, double tazaDeConversion, String monedaDestino) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tazaDeConversion = tazaDeConversion;
        this.monedaDestino = monedaDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTazaDeConversion() {
        return tazaDeConversion;
    }


    public void setTazaDeConversion(double tazaDeConversion) {
        this.tazaDeConversion = tazaDeConversion;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public void crearMoneda(String nombre, int cantidad, double tazaDeConversion, String monedaDestino) {
       this.nombre = nombre;
       this.cantidad = cantidad;
       this.tazaDeConversion = tazaDeConversion;
       this.monedaDestino = monedaDestino;
   }
    @Override
    public String toString() {
        return "Moneda{" +
                "moneda='" + getNombre() + '\'' +
                ", cantidad=" + getCantidad() +
                ", tazaDeConversion=" + getTazaDeConversion() +
                '}';
    }
    public String convertir(){
        double conversion = cantidad * tazaDeConversion;
        return "tus monedas son "+ nombre + " tu nueva cantidad es " + conversion + " " + monedaDestino;
    }
}
