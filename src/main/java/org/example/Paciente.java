package org.example;

public class Paciente {
    private String nombre;
    private int edad;
    private String contacto;

    public Paciente(String nombre, int edad, String contacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

}
