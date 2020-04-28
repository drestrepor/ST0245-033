import java.util.Scanner;

public class Ejecucion {
    //Main

    public static void main(String[] args) {
        Recorrido(LeerDatos());
    }


    //Métodos

    public static void Recorrido(Arbol bot) {
        AuxRec(bot.nodo);
    }

    public static void AuxRec(Nodo x) {
        if( x!=null ) {
            AuxRec(x.izq);
            AuxRec(x.der);
            System.out.println(x.valor);
        }
    }

    public static Arbol LeerDatos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nodos que va a tener.");
        int cantidad = scan.nextInt();
        int[] elementos = new int[cantidad];
        for(int i =0; i < elementos.length; i++){
            System.out.println("Ingrese el elemento "+(i+1)+" de " + cantidad);
            elementos[i] = scan.nextInt();
        }
        Arbol bot = new Arbol(elementos[0]);
        for(int i =1; i < elementos.length; i++){
            bot.insertar(bot.nodo, elementos[i]);
        }
        return bot;
    }
}
