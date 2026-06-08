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