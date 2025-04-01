package org.example;
import java.util.ArrayList;
import java.util.List;

public class GestorCitas {
    private List <CitaMedica> citas;

    public GestorCitas() {
        this.citas = new ArrayList<>();
    }

    public void agendarCita(CitaMedica cita) {
        citas.add(cita);
        System.out.println("Cita agendada: " + cita);
    }

    public void cancelarCita(CitaMedica cita) {
        if (citas.remove(cita)) {
            System.out.println("Cita cancelada: " + cita);
        } else {
            System.out.println("Cita no encontrada: " + cita);
        }
    }


}
