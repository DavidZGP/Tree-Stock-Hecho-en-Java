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