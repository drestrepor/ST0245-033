import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This is the class for creating the
 * nodes for the decision tree.
 */
public class Node {
    public int algo;
    public String variable;
    public String[][] matriz;
    public String[][] impurezas;
    public int exito[];
    public String impureza;
    public Node izq;
    public Node der;

    /**
     * This is the constructor for the node-
     * @param matrizDeDatos matrix with the data
     *                      created for accessing
     *                      easily to the data.
     * @param exito exito matrix.
     */
    public Node(String[][] matrizDeDatos, int [] exito) {
        matriz = matrizDeDatos;
        impurezas = llenarImpureza(matriz,exito);
        this.exito = exito;
        int columnas = matrizDeDatos[0].length;
        if (columnas > 1) {
            impureza = variableConMenorImpureza(impurezas);
            variable = equivalencia(matriz,impurezas,impureza);
            algo = algo(matriz, variable);
            String[][] matrizIzq = mayores(matriz, (int) algo, variable);
            //LinkedList<Integer> indiM = indicesMayores(matriz, (int) algo, variable);
            String[][] matrizDer = menores(matriz, (int) algo, variable);
            //LinkedList<Integer> indimenor = indicesMenores(matriz, (int) algo, variable);
            //int [] exitoIzq = exitoMenor(exito,indimenor);
            //int [] exitoDer = exitoMayor(exito,indiM);
            if (matrizIzq.length > 0)
                izq = new Node(matrizIzq, exito );
            if (matrizDer.length > 0)
                der = new Node(matrizDer,exito);
        }
    }

    /**
     * Returns the number of the variable
     * that will be processed.
     * @param matriz
     * @param algo
     * @return
     */
    public static int algo(String[][] matriz, String algo){
        long inicio_algo = System.currentTimeMillis();

        for (int i = 0; i < matriz[0].length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                if (matriz[j][i] == algo) {
                    return i;
                }
            }
        }

        long fin_algo = System.currentTimeMillis();
        long total_algo = fin_algo - inicio_algo;
        System.out.println("Tiempo de ejecución para algo(__): " + total_algo + "ms");

        return 0;
    }

    /**
     * Returns the value of the variable that is being processed.
     * @param matriz
     * @param impureza
     * @param valorImpureza
     * @return
     */
    public static String equivalencia(String[][] matriz, String[][] impureza, String valorImpureza ) {
        long inicio_equiv = System.currentTimeMillis();

        for (int j = 0; j <impureza[0].length ; j++) {
            for (int i = 0; i <impureza.length ; i++) {
                if (Double.parseDouble(impureza[i][j]) == Double.parseDouble(valorImpureza)) {
                    //System.out.println("Está en la posición: " + "[" + j +   "]" + "[" + i + "]");
                    return matriz[i][j];
                }
            }
        }

        long fin_equiv = System.currentTimeMillis();
        long total_equiv = fin_equiv - inicio_equiv;
        System.out.println("Tiempo de ejecución para equivalencia(__): " + total_equiv + "ms");

        return "";
    }

    /**
     * An optional method in case the developer needs the row where the variable is.
     * @param matriz
     * @param algo
     * @return
     */
    public static int fila(double[][] matriz, double algo) {
        long inicio_fila = System.currentTimeMillis();

        for (int i = 0; i < matriz[0].length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {

                if(matriz[j][i] == algo){
                    return j;
                }
            }
        }

        long fin_fila = System.currentTimeMillis();
        long total_fila = fin_fila - inicio_fila;
        System.out.println("Tiempo de ejecución para fila(__): " + total_fila + "ms");

        return 0;
    }

    /**
     * This method finds the lowest gini impurity
     * in the data matrix.
     * @param impureza5
     * @return
     */
    public static String variableConMenorImpureza(String[][] impureza5) {
        String a = impureza5[0][0];
        for (int i = 0; i < impureza5[0].length ; i++) {
            for (int j = 0; j <impureza5.length; j++) {
                if(Double.parseDouble(impureza5[j][i]) < Double.parseDouble(a)){
                    a = impureza5[j][i];
                }
            }
        }
        return a;
    }


    /**
     * This method cuts the columns that
     * have already been processed.
     * @param matriz
     * @param colum
     * @return
     */
    public static String[][] recortada (String[][] matriz, int colum) {
        long inicio_recortada = System.currentTimeMillis();

        String[][] recortada = new String[matriz.length][(matriz[0].length-1)];
        int w = 0;
        for (int i = 0; i < matriz[0].length ; i++) {
            if (i == colum){
                continue;
            }
            for (int j = 0; j < matriz.length; j++) {
                recortada[j][w] = matriz[j][i];
            }
            w++;
        }

        long fin_recortada = System.currentTimeMillis();
        long total_recortada = fin_recortada - inicio_recortada;
        System.out.println("Tiempo de ejecución para recortada(__): " + total_recortada + "ms");

        return recortada;
    }

    /**
     * This method calculates the gini impurity
     * @param matriz
     */
    public static String[][] llenarImpureza(String[][] matriz, int [] exito) {
        long inicio_llenar = System.currentTimeMillis();

        //Metodo para llenar la matriz
        String[][] impureza5 = new String[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz[0].length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                ArrayList<String > derecha = new ArrayList<>();
                ArrayList<String> izquierda = new ArrayList<>();
                String variableParte= matriz[j][i];
                int mayores= 0;
                int menores = 0;
                int royaI = 0;
                int noRoyaI = 0;
                int royaD = 0;
                int noRoyaD = 0;
                String impureza;
                String impurezaD;
                String impurezaI;

                for (int k = 0; k < matriz.length ; k++) {
                    if (Double.parseDouble(matriz[k][i]) <= Double.parseDouble(variableParte)) {
                        if (exito[k]==1){
                            royaI++;
                        }else if(exito[k]==0){
                            noRoyaI++;
                        }
                        menores++;
                        izquierda.add(matriz[k][i]);
                    } else {
                        if (exito[k]==1){
                            royaD++;
                        }else if(exito[k]==0){
                            noRoyaD++;
                        }
                        mayores++;
                        derecha.add(matriz[k][i]);
                    }
                }
                impurezaD = String.valueOf((double) 1-(Math.pow(((double)royaD/derecha.size()),2)+ Math.pow(((double)noRoyaD/derecha.size()),2)));
                impurezaI = String.valueOf((double) 1-(Math.pow(((double)royaI/izquierda.size()),2)+ Math.pow(((double)noRoyaI/izquierda.size()),2)));
                impureza= String.valueOf(((menores*Double.parseDouble(impurezaI))+(mayores*Double.parseDouble(impurezaD))/(mayores+menores)));
                impureza5[j][i]=impureza;
                System.out.println("Variable"+"["+i+"]"+"["+j+"]" +" Estos son los mayores que "+variableParte+": "+mayores+" y de esos mayores "+royaD+" tienen roya y "+noRoyaD+" no tienen roya");
                System.out.println("Variable"+"["+i+"]"+"["+j+"]" +" Estos son los menores que "+variableParte+": "+menores+" y de esos menores "+royaI+" tienen roya y "+noRoyaI+" no tienen roya");
            }
        }


        /**for (int i = 0; i < impureza5.length ; i++) {
         for (int j = 0; j < 6; j++) {
         System.out.print(impureza5[i][j] + "\t");
         }
         System.out.println();
         }*/

        long fin_llenar = System.currentTimeMillis();
        long total_llenar = fin_llenar - inicio_llenar;
        System.out.println("Tiempo de ejecución para llenarImpureza(__): " + total_llenar + "ms");

        return impureza5;
    }


    /**
     * This method splits the values
     * that are higher than a given value in
     * a column in the matrix.
     * @param matriz
     * @param colum
     * @param valor
     * @return
     */
    public static String[][]  mayores (String[][] matriz, int colum, String valor){
        long inicio_mayores = System.currentTimeMillis();

        LinkedList<Integer> indicesDeLasFilasMayores = new LinkedList();
        for (int i = 0; i < matriz.length  ; i++) {
            if (Double.parseDouble(matriz[i][colum]) >= Double.parseDouble(valor))
                indicesDeLasFilasMayores.add(i);
        }
        String [][] grandes = new String[indicesDeLasFilasMayores.size()][matriz[0].length];
        int indice = 0;
        for (int i = 0; i < grandes.length ; i++) {
            for (int j = 0; j < grandes[0].length; j++) {
                grandes[i][j] = matriz[indicesDeLasFilasMayores.get(indice)][j];
            }
            indice++;
        }
        String[][] recorte = recortada(grandes,colum);

        long fin_mayores = System.currentTimeMillis();
        long total_mayores = fin_mayores - inicio_mayores;
        System.out.println("Tiempo de ejecución para mayores(__): " + total_mayores + "ms");

        return recorte;
    }

    /**
     *
     * @param matriz
     * @param colum
     * @param valor
     * @return
     */
    public static LinkedList<Integer> indicesMayores(double [][] matriz, int colum, double valor) {
        long inicio_indicesMay = System.currentTimeMillis();

        LinkedList<Integer> indicesDeLasFilasMayores = new LinkedList();
        for (int i = 0; i < matriz.length  ; i++) {
            if (matriz[i][colum] >= valor)
                indicesDeLasFilasMayores.add(i);
        }

        long fin_indicesMay = System.currentTimeMillis();
        long total_indicesMay = fin_indicesMay - inicio_indicesMay;
        System.out.println("Tiempo de ejecución para indicesMayores(__): " + total_indicesMay + "ms");

        return indicesDeLasFilasMayores;
    }

    /**
     *
     * @param matriz
     * @param colum
     * @param valor
     * @return
     */
    public static LinkedList<Integer> indicesMenores(double [][] matriz, int colum, double valor) {
        long inicio_indicesMen = System.currentTimeMillis();

        LinkedList<Integer> indicesDeLasFilasMenores = new LinkedList();
        for (int i = 0; i < matriz.length  ; i++) {
            if (matriz[i][colum] < valor)
                indicesDeLasFilasMenores.add(i);
        }

        long fin_indicesMen = System.currentTimeMillis();
        long total_indicesMen = fin_indicesMen - inicio_indicesMen;
        System.out.println("Tiempo de ejecución para indicesMayores(__): " + total_indicesMen + "ms");

        return indicesDeLasFilasMenores;
    }

    /**
     *
     * @param matriz
     * @param colum
     * @param valor
     * @return
     */
    public static String[][]  menores (String[][] matriz, int colum, String valor) {
        long inicio_menores = System.currentTimeMillis();

        LinkedList<Integer> indicesMenores = new LinkedList();
        for (int i = 0; i < matriz.length  ; i++) {
            if (Double.parseDouble(matriz[i][colum]) < Double.parseDouble(valor))
                indicesMenores.add(i);
        }
        String [][] pequeños = new String[indicesMenores.size()][matriz[0].length];
        int indice = 0;
        for (int i = 0; i < pequeños.length ; i++) {
            for (int j = 0; j < pequeños[0].length; j++) {
                pequeños[i][j] = matriz[indicesMenores.get(indice)][j];
            }
            indice++;
        }
        String[][] recorte = recortada(pequeños,colum);

        long fin_menores = System.currentTimeMillis();
        long total_menores = fin_menores - inicio_menores;
        System.out.println("Tiempo de ejecución para menores(__): " + total_menores + "ms");

        return recorte;
    }
}
