package org.example;
public class Dron extends InteligenciaArtificial {
    private String marca;
    private String material;

    public Dron(String nombre) {
        super(nombre);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Información del Dron:");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Marca: " + this.marca);
        System.out.println("Material de fabricación: " + this.material);
        System.out.println("**********************************\n");
    }
}