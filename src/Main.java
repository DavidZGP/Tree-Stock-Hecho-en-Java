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

            if (sc.hasNextInt()) {
    opcion = sc.nextInt();
            } else {
            System.out.println("Error: Debe ingresar un número.");
            sc.nextLine(); // limpia la entrada incorrecta
            opcion = -1;
            continue;
            }

        sc.nextLine(); // limpiar buffer
            
             switch (opcion) {
                case 1:
                    int id;

                    while (true) {
                    System.out.print("Digite el ID del producto: ");

                    if (sc.hasNextInt()) {
                    id = sc.nextInt();
                    sc.nextLine();
                    break;
                    } else {
                    System.out.println("Error: El ID debe ser numérico.");
                    sc.nextLine();
                    }
                    }

                    System.out.print("Digite el nombre del producto: ");
                    String nombre = sc.nextLine();

                    inventario.insertar(id, nombre);
                    System.out.println("Producto registrado correctamente.");
                    break;

                case 2:
                    inventario.mostrarInorden();
                    break;

                case 3:
                    int idBuscar;

                    while (true) {
                    System.out.print("Digite el ID a buscar: ");

                    if (sc.hasNextInt()) {
                        idBuscar = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Error: Debe ingresar un número.");
                        sc.nextLine();
                    }
                    }

                    Producto encontrado = inventario.buscar(idBuscar);

                    if (encontrado != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println("ID: " + encontrado.id + " | Nombre: " + encontrado.nombre);
                    } else {
                        System.out.println("No existe un producto con ese ID.");
                    }
                    break; 
                
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}