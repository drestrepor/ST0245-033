import java.util.LinkedList;

public class Pila {
    //Atributos
    int posicionPila;
    int posNumero;
    LinkedList<Bloque> elementos = new LinkedList<Bloque>();

    //Constructor
    public Pila(int i) {
        posicionPila = i;
        elementos.add(new Bloque(i));
        posNumero = i;
    }
}
