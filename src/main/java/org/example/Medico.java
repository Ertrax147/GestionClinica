package org.example;

public class Medico {
    private String nombre;
    private String especialidad;
    private boolean disponible;

    public Medico(String nombre, String especialidad, boolean disponible) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
