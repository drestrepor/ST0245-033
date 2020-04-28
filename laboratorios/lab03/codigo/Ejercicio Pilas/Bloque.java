import java.util.LinkedList;

public class Bloque {
    //Atributos
    int numero;
    int posicion;
    LinkedList<Bloque> encima = new LinkedList<Bloque>();

    //Constructor
    public Bloque (int a) {
        numero = a;
        posicion = a;
    }


    //Métodos

    public void setPos (){}
}
