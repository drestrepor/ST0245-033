import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Mapa {
    LinkedList<Nodo> lugares;

    public Mapa(String path) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(path));
        lugares = new LinkedList<>();

        while (!scan.nextLine().contains("Vertices")) {

        }

        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            if (linea.contains("Arcos.")) {
                break;
            }
            String[] temp = linea.split(" ");

            if (temp.length <= 1) {
                continue;
            }

            String nombre;
            if (temp.length > 3) {
                nombre = temp[3];
                for (int i = 4; i < temp.length; i++) {
                    nombre = " " + temp[i];
                }
            }
            else nombre = "N/A";

            lugares.add(new Nodo(temp[0], temp[1], temp[2], nombre));
        }

        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            String[] temp = linea.split(" ");

            if (temp.length <= 1) {
                continue;
            }

            String nombre;
            if (temp.length > 3) {
                nombre = temp[3];
                for (int i = 4; i < temp.length; i++) {
                    nombre = " " + temp[i];
                }
            }
            else nombre = "N/A";

            for (Nodo primero : lugares) {
                if (primero.id.equals(temp[0])) {
                    for (Nodo segundo : lugares) {
                        if (segundo.id.equals(temp[1])) {
                            primero.add(nombre, segundo, temp[2]);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
