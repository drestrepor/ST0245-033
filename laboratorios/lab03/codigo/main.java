import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Bienvenido!");


    }

    public static void programa() {
        Scanner scan = new Scanner(System.in);
        Consultas cons = new Consultas();

        System.out.println("¿Cuál consulta desea realizar?");
        System.out.println("Presione 1 para la consulta 1," +
                            " o 2 para la consulta 2");

        int x = scan.nextInt();

        if (x == 1) cons.consulta1();
        else if (x == 2) cons.consulta2();

        System.out.println("¿Quiere realizar otra consulta?");
        System.out.println("Presione 1 para Sí, o 2 para No");

        int y = scan.nextInt();

        if (y == 1) programa();
        else if (x == 2)
            System.out.println("Perfecto. Hasta luego");
    }
}
