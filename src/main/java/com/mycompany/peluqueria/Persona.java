package com.mycompany.peluqueria;

import javax.swing.JOptionPane;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double peso;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String leerDatoTipoCadena(String mensaje) {
        String valor = "";
        valor = JOptionPane.showInputDialog(null, mensaje);
        return (valor);
    }

    public double leerDatoTipoReal(String mensaje) {
        double valor = 0.0;
        valor
                = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
        return (valor);
    }

    public int leerDatoTipoEntero(String mensaje) {
        int valor = 0;
        try {
            valor
                    = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
            return (valor);
        } catch (Exception errorIngreso) {
            errorIngreso.printStackTrace();
            return (0);
        }
    }
}
