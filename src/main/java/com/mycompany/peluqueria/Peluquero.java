package com.mycompany.peluqueria;

import javax.swing.JOptionPane;

public class Peluquero extends Persona {

    private double servicio1;
    private double sercicio2;
    private double servicio3;
    private double servicio4;

    public Peluquero() {
    }

    public Peluquero(String nombre, double servicio1, double sercicio2, double servicio3, double servicio4) {
       super();
        this.servicio1 = servicio1;
        this.sercicio2 = sercicio2;
        this.servicio3 = servicio3;
        this.servicio4 = servicio4;
    }

    public double getServicio1() {
        return servicio1;
    }

    public void setServicio1(double servicio1) {
        this.servicio1 = servicio1;
    }

    public double getSercicio2() {
        return sercicio2;
    }

    public void setSercicio2(double sercicio2) {
        this.sercicio2 = sercicio2;
    }

    public double getServicio3() {
        return servicio3;
    }

    public void setServicio3(double servicio3) {
        this.servicio3 = servicio3;
    }

    public double getServicio4() {
        return servicio4;
    }

    public void setServicio4(double servicio4) {
        this.servicio4 = servicio4;
    }
    
    
    public String cambiarNombre1(String nombre){
        return nombre = "Nicolas";
    }
    public String cambiarNombre2(String nombre){
        return nombre = "Raul";
    }
    public String cambiarNombre3(String nombre){
        return nombre = "Ignacio";
    }
    public String cambiarNombre4(String nombre){
        return nombre = "Sebas";
    }
   
    public double calcularCorteCaballero(double servicio1){
       return servicio1 = servicio1 * 8000;
    }
    public double calcularCorteDama(double servicio2){
       return servicio2 = servicio2 * 10500;
    }
    public double calcularTintura(double servicio3){
       return servicio3 = servicio3 * 40000;
    }
    public double calcularPeinado(double servicio4){
       return servicio3 = servicio4 * 15000;
    }

    // Método para reiniciar el acumulador
    
}
