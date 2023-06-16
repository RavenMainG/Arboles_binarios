package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú del Árbol");
            System.out.println("1. Ingresar nodo");
            System.out.println("2. Recorrido en preorden");
            System.out.println("3. Recorrido en entreorden");
            System.out.println("4. Recorrido en posorden");
            System.out.println("5. Imprimir nivel de un nodo");
            System.out.println("6. Diferencia de altura de nodos");
            System.out.println("7. Generar árbol aleatorio");
            System.out.println("8. Buscar dato");
            System.out.println("9. Eliminar dato");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del nodo: ");
                    int valor = scanner.nextInt();
                    arbol.ingresarNodo(valor);
                    break;
                case 2:
                    System.out.println("Recorrido en preorden:");
                    arbol.recorridoPreOrden();
                    break;
                case 3:
                    System.out.println("Recorrido en entreorden:");
                    arbol.recorridoEntreOrden();
                    break;
                case 4:
                    System.out.println("Recorrido en posorden:");
                    arbol.recorridoPosOrden();
                    break;
                case 5:
                    System.out.print("Ingrese el nivel del nodo: ");
                    int nivel = scanner.nextInt();
                    arbol.imprimirNivelNodo();
                    break;
                case 6:
                    System.out.println("Diferencia de altura de nodos:");
                    arbol.diferenciaAlturaNodos();
                    break;
                case 7:
                    System.out.print("Ingrese el número de nodos a generar: ");
                    int numNodos = scanner.nextInt();
                    arbol.generarArbolAleatorio(numNodos);
                    break;
                case 8:
                    System.out.print("Ingresa el dato que deseas buscar: ");
                    int datoBuscar = scanner.nextInt();
                    arbol.busquedaNodo(datoBuscar);
                    break;
                case 9:
                    System.out.print("Ingresa el nodo a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    arbol.eliminarNodo(datoEliminar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}