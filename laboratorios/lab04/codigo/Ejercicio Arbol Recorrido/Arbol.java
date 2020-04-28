public class Arbol {
    //Atributos
    Nodo nodo;

    //Constructor
    public Arbol(int a){
        nodo = new Nodo(a);
    }

    //Métodos
    public Nodo insertar(Nodo a, int b){
        if(a == null){
            return new Nodo(b);
        }else if(b < a.valor){
            a.izq = insertar(a.izq, b);
        }else if(b > a.valor){
            a.der = insertar(a.der, b);
        }
        return a;
    }
}
