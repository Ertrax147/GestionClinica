package org.example;
import java.util.ArrayList;
import java.util.List;

public class CentroClinico {
    private String nombre;
    private String direccion;
    private List <Medico> medicos;

    public CentroClinico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public String getNombre() {
        return nombre;
    }
}
