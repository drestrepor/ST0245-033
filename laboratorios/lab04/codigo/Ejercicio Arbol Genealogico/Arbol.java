public class Arbol {
    Nodo raiz;

    public Arbol(String nombre) {
        raiz = new Nodo(nombre);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public String getAbuelaMaterna() {
        String nombre = this.raiz.getMadre().getMadre().nombre;
        if (nombre != null) return nombre;
        return "El miembro en cuestión no está disponible.";
    }
}
