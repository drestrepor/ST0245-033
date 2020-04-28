import java.util.ArrayList;
import java.util.Scanner;

public class Ejecucion {
    public static String[] leerDatos () {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> comandos = new ArrayList<String>();
        System.out.println("Ingrese los comandos: ");
        while (scan.hasNextLine()) {
            String com = scan.nextLine();
            if (!(com.equals("quit"))) {
                comandos.add(com);
            } else {
                comandos.add(com);
                break;
            }
        }
        return comandos.toArray(new String[comandos.size()]);
    }
}
