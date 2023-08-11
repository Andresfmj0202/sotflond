package main.Java.com.sotflond.POO.SistemaHotel;

import javax.swing.*;

public class Cliente {
    private String nombreEmpresa;
    private String nombre;
    private String cedula;

    public Cliente(String nombreEmpresa, String nombre, String cedula){
        this.nombreEmpresa = nombreEmpresa;
        this.nombre = nombre;
        this.cedula = cedula;

    }

        public String getNombreEmpresa() {
            return nombreEmpresa;
        }

        public void setNombreEmpresa(String nombreEmpresa) {
            this.nombreEmpresa = nombreEmpresa;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

    }



