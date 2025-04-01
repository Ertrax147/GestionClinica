package org.example;

public class Main {
    public static void main(String[] args) {
        // centro clinico
        CentroClinico centro = new CentroClinico("Clínica Salud", "Calle123");

        // Creamos medicos
        Medico medico1 = new Medico("Dr.", "Cardiología", true);
        Medico medico2 = new Medico("Dra. ", "Pediatría", true);
        centro.agregarMedico(medico1);
        centro.agregarMedico(medico2);

        // Creamos pacientes
        Paciente paciente1 = new Paciente("Juan", 30, "987654321");
        Paciente paciente2 = new Paciente("Ana ", 25, "123456789");

        // Crear gestor de citas
        GestorCitas gestor = new GestorCitas();

        // Agendar una cita
        CitaMedica cita1 = new CitaMedica(medico1, paciente1, "10/07/2024", "15:00", "Revisión general");
        gestor.agendarCita(cita1);

        // Mostrar citas agendadas
        gestor.listarCitas();

        // Cancelar la cita
        gestor.cancelarCita(cita1);
    }
}