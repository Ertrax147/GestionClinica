package org.example;

public class CitaMedica {
    private Medico medico;
    private Paciente paciente;
    private String fecha;
    private String hora;
    private String motivo;

    public CitaMedica(Medico medico, Paciente paciente, String fecha, String hora, String motivo) {
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "medico=" + medico +
                ", paciente=" + paciente +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", motivo='" + motivo + '\'' +
                '}';
    }
}
