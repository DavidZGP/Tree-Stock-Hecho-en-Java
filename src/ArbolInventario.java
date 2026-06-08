package src;
public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

     // Insertar producto de forma recursiva
    public void insertar(int id, String nombre) {
        raiz = insertarRec(raiz, id, nombre);
    }

    private Producto insertarRec(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }
    if (id < actual.id) {
            actual.izquierdo = insertarRec(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRec(actual.derecho, id, nombre);
        } else {
            System.out.println("Ya existe un producto con ese ID. No se puede duplicar.");
        }

        return actual;
    }

     // Recorrido inorden para mostrar ordenado por ID
    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\nInventario ordenado:");
            inordenRec(raiz);
        }
    }

    private void inordenRec(Producto actual) {
        if (actual != null) {
            inordenRec(actual.izquierdo);
            System.out.println("ID: " + actual.id + " | Nombre: " + actual.nombre);
            inordenRec(actual.derecho);
        }
    }

     // Buscar producto por ID
    public Producto buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Producto buscarRec(Producto actual, int id) {
        if (actual == null) {
            return null;
        }
    
        if (id == actual.id) {
            return actual;
        } else if (id < actual.id) {
            return buscarRec(actual.izquierdo, id);
        } else {
            return buscarRec(actual.derecho, id);
        }
    }
}