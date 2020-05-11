import java.util.LinkedList;

public class Grafo {

    //Atributos

    boolean [][] nodos;



    //Constructor

    public Grafo(int tamaño) {
        nodos = new boolean[tamaño][tamaño];
    }




    //Metodos

    public void añadRel(int uno, int dos) {
        nodos[uno][dos] = true;
        nodos[dos][uno] = true;
    }

    private boolean cumple(int n) {
        if (nodos == null) {
            return true;
        }
        if (n >= nodos.length) {
            return false;
        }

        LinkedList<Integer> grupo2 = new LinkedList<>();

        for (int j = 0; j < nodos.length; j++) {
            if (nodos[n][j]) grupo2.add(j);
        }

        for (int x : grupo2) {
            for (int y : grupo2) {
                if (nodos[x][y]) {
                    return cumple(n + 1);
                }
            }
        }
        grupo2.clear();
        return true;
    }

    public boolean cumple() {
        return cumple(0);
    }
}
