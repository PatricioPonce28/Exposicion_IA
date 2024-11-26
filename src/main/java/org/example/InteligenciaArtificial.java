package org.example;

public class InteligenciaArtificial {
    private final String nombre;

    public InteligenciaArtificial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void mostrarInfo() {
        System.out.println("¡Bienvenidos a la guía del robot " + this.getNombre() + "!");
        System.out.println("**********************************");
    }
}

