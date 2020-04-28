import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Mundo {
    //Atributos
    int longitud;
    Pila[] pilas;

    //Constructor
    public Mundo (int longitud) {
        this.longitud = longitud;
        Pila[] pilas1 = new Pila[longitud];
        for (int i = 0; i < longitud; i++) {
            if (pilas1[i] == null) {
                pilas1[i] = new Pila(i);
            }
        }
        pilas = pilas1;
    }

    //Métodos
    public static void main(String[] args) {
        Pila[] pilas1 = new Mundo(5).pilas;

        for (int i = 0; i < pilas1.length; i++) {
            int size = pilas1[i].elementos.size();
            for (int j = 0; j < size; j++) {
                System.out.println(pilas1[i].posicionPila + " : " + pilas1[i].elementos.removeFirst().numero);
            }
        }
    }

    public void moveAOntoB (int a , int b) {
        int bloqueA = pilas[pilas[a].posNumero].posicionPila;
        int bloqueB = pilas[pilas[b].posNumero].posicionPila;
        Pila pilas1 = pilas[a];
        for (Bloque x : pilas1.elementos) {
            if (x.numero == a) {
                for (Bloque y : x.encima) {
                    y.posicion = y.numero;
                    pilas[y.numero].elementos.add(y);
                    x.encima.remove(y);
                }
            }
        }
        Pila pilas2 = pilas[b];
        for (Bloque x : pilas2.elementos) {
            if (x.numero == a) {
                for (Bloque y : x.encima) {
                    y.posicion = y.numero;
                    pilas[y.numero].elementos.add(y);
                    x.encima.remove(y);
                }
            }
        }

    }

    public void moveAOverB () {

    }

    public void pileAOntoB () {

    }

    public void pileAOverB () {

    }



}