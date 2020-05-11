import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Ingrese los nodos: ");

        String linea = scan.nextLine();
        boolean cero = linea.trim().equals("0");

        try {
            while (!cero) {
                int nodos = Integer.parseInt(linea);
                System.out.print("Ingrese los respectivos arcos: ");
                int arcos = Integer.parseInt(scan.nextLine());

                Grafo colores = new Grafo(nodos);
                System.out.println("Ingrese los caminos de este modo ---> Nodo - Nodo");
                for(int i = 0; i < arcos; i++) {
                    linea = scan.nextLine();
                    String [] rels = linea.split(" ");

                    if (rels.length >= 2) {
                        int primero = Integer.parseInt(rels[0]);
                        int segundo = Integer.parseInt(rels[1]);
                        if ((primero >= 0 && primero < nodos) && (segundo >= 0 && segundo < nodos)) {
                            colores.añadRel(primero, segundo);
                        }
                        else
                            throw new Exception("Error - Revise los valores");
                    }
                    else {
                        throw new Exception("Error - Faltan Arcos");
                    }
                }

                if (colores.cumple()) {
                    System.out.println("Es bicoloreable");
                }
                else {
                    System.out.println("No es bicoloreable");
                }

                System.out.println();
                System.out.print("Ingrese los nodos: ");
                linea = scan.nextLine();
                cero = linea.trim().equals("0");
            }


        }
        catch (NumberFormatException e) {
            System.out.println("Error");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
