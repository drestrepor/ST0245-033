import java.util.LinkedList;

public class Nodo {

    //Atributos

    String nombre;
    LinkedList<Relaciones> hijos;
    String id;
    double coordX;
    double coordY;


    //Constructor

    public Nodo(String id, String coordX, String coordY, String nombre) {
        this.nombre = nombre;
        hijos = new LinkedList<Relaciones>();
        this.id = id;
        this.coordX = Double.parseDouble(coordX);
        this.coordY = Double.parseDouble(coordY);
    }


    //Métodos

    public void add(String nombre, Nodo destino, String distancia) {
        hijos.add(new Relaciones(nombre, destino, Double.parseDouble(distancia)));
    }
}
