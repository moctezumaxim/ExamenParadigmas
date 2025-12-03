package main;

import modelos.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA TECHMASTER ---\n");

        List<Dispositivo> inventario = new ArrayList<>();

        Laptop laptop1 = new Laptop("Dell", "XPS 15", 1299.99, 16);
        Smartphone phone1 = new Smartphone("Samsung", "Galaxy S24", 899.99, 4);

        inventario.add(laptop1);
        inventario.add(phone1);

        for (Dispositivo dispositivo : inventario) {
            System.out.println("\nEl objeto es un " + dispositivo.getClass().getSimpleName());

            dispositivo.encender();

            if (dispositivo instanceof Laptop) {
                Laptop laptop = (Laptop) dispositivo;
                laptop.mostrarEspecificaciones();
            } else if (dispositivo instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) dispositivo;
                smartphone.mostrarEspecificaciones();
            }

            dispositivo.conectarInternet();
        }

        System.out.println("\n--- PRUEBA DE SOBRECARGA ---");
        System.out.println("- Caso A: (Método 1)");
        laptop1.instalarSoftware("Microsoft Office");

        System.out.println("- Caso B: (Método 1 - Sobrecargado)");
        laptop1.instalarSoftware("Adobe Photoshop", "2024");
    }
}