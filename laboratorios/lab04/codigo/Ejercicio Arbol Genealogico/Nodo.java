public class Nodo {
    String nombre;
    Nodo mama;
    Nodo papa;

    public Nodo (String nombre) {
        this.nombre = nombre;
    }

    public Nodo getPadre() {
        if (papa != null)
            return papa;
        else
            return null;
    }

    public Nodo getMadre() {
        if (mama != null)
            return mama;
        else
            return null;
    }

    public void setPadre(String padre) {
        papa = new Nodo(padre);
    }

    public void setMadre(String madre) {
        mama = new Nodo(madre);
    }
}
