package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada(); // usa tu nuevo nombre de clase
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Eliminar al inicio");
            System.out.println("3. Imprimir lista");
            System.out.println("4. Buscar un dato");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            // Leer entero y limpiar buffer
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                scanner.next(); // limpia entrada no válida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Por favor, ingresa un número válido: ");
                        scanner.next();
                    }
                    int dato = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    lista.insertarAlInicio(dato);
                    System.out.println("Elemento insertado al inicio.");
                    esperarEnter(scanner);
                    break;

                case 2:
                    lista.eliminarAlInicio();
                    esperarEnter(scanner);
                    break;

                case 3:
                    lista.imprimirLista();
                    esperarEnter(scanner);
                    break;

                case 4:
                    System.out.print("Ingresa el dato a buscar: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Por favor, ingresa un número válido: ");
                        scanner.next();
                    }
                    int buscar = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    if (lista.buscar(buscar)) {
                        System.out.println("Dato encontrado en la lista.");
                    } else {
                        System.out.println("Dato no encontrado.");
                    }
                    esperarEnter(scanner);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    esperarEnter(scanner);
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Método para pausar hasta que el usuario presione Enter
    private static void esperarEnter(Scanner scanner) {
        System.out.println("\nPresiona Enter para continuar...");
        scanner.nextLine();
    }
}
