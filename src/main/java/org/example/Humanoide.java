package org.example;

public class Humanoide extends InteligenciaArtificial {
    private double nivelBateria;
    private String tareaAsignada;
    private double progresoTarea;

    public Humanoide(String nombre, double nivelBateria, String tareaAsignada, double progresoTarea) {
        super(nombre);
        this.nivelBateria = nivelBateria;
        this.tareaAsignada = tareaAsignada;
        this.progresoTarea = progresoTarea;
    }

    public double getNivelBateria() {
        return this.nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getTareaAsignada() {
        return this.tareaAsignada;
    }

    public double getProgresoTarea() {
        return this.progresoTarea;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("Información del Humanoide:");
        System.out.println("Nivel de batería: " + this.getNivelBateria() + "%");
        System.out.println("Tarea asignada: " + this.getTareaAsignada());
        System.out.println("Progreso: " + this.getProgresoTarea() + "%");
        System.out.println("**********************************\n");
    }
}



