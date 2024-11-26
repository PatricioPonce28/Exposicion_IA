package org.example;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la IA: ");
        String nombre = scanner.nextLine();
        InteligenciaArtificial chat = new InteligenciaArtificial("Copilot");
        Dron dron = new Dron(chat.getNombre());
        dron.setMarca("RJ25");
        dron.setMaterial("Fibra de Carbono");
        Humanoide humanoide = new Humanoide(chat.getNombre(),75.0, "Implementar Sistemas de Seguridad", 15.0);
        chat.mostrarInfo();
        dron.mostrarInfo();
        humanoide.mostrarInfo();
    }
}