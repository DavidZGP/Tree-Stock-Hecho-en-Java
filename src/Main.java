package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion;

        do {
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            
             switch (opcion) {
                case 1:
                    System.out.print("Digite el ID del producto: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    System.out.print("Digite el nombre del producto: ");
                    String nombre = sc.nextLine();

                    inventario.insertar(id, nombre);
                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    inventario.mostrarInorden();
                    break;

                case 3:
                    System.out.print("Digite el ID a buscar: ");
                    int idBuscar = sc.nextInt();

                    Producto encontrado = inventario.buscar(idBuscar);

                    if (encontrado != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println("ID: " + encontrado.id + " | Nombre: " + encontrado.nombre);
                    } else {
                        System.out.println("No existe un producto con ese ID.");
                    }
                    break; 