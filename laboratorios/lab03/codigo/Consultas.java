import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Consultas {

    public void consulta1() {
        LinkedList<Dato> curso1;
        LinkedList<Dato> curso3;
        LinkedList<Dato> curso2;

        ListaDatos curso1a = new ListaDatos();
        ListaDatos curso2a = new ListaDatos();
        ListaDatos curso3a = new ListaDatos();

        Scanner scan = new Scanner(System.in);

        String mat;
        String sem;

        System.out.println("Indique la materia");
        mat = scan.nextLine();

        System.out.println("Indique el semestre");
        sem = scan.nextLine();

        curso1 = curso1a.lecturaDatos("Notas ST0242.csv");

        for (Dato dato: curso1) {
            if (dato.materia.equals(mat) && dato.semestre.equals(sem)) {
                System.out.println(dato.nombre + " " + dato.definitiva);
            }
        }


        curso2 = curso2a.lecturaDatos("Notas ST0245.csv");

        for (Dato dato: curso2) {
            if (dato.materia.equals(mat) && dato.semestre.equals(sem)) {
                System.out.println(dato.nombre + " " + dato.definitiva);
            }
        }


        curso3 = curso3a.lecturaDatos("Notas ST0247.csv");

        for (Dato dato: curso3) {
            if (dato.materia.equals(mat) && dato.semestre.equals(sem)) {
                System.out.println(dato.nombre + " " + dato.definitiva);
            }
        }
    }

    public void consulta2 () {
        LinkedList<Dato> curso1;
        LinkedList<Dato> curso2;
        LinkedList<Dato> curso3;

        ListaDatos curso1a = new ListaDatos();
        ListaDatos curso2a = new ListaDatos();
        ListaDatos curso3a = new ListaDatos();

        Scanner scan = new Scanner(System.in);

        String nombre;
        String sem;

        System.out.println("Ingrese el nombre del estudiante");
        nombre = scan.nextLine();

        System.out.println("Ingrese el semestre que quiere ver");
        sem = scan.nextLine();

        curso1 = curso1a.lecturaDatos("NOTAS ST0242.CSV");

        for (Dato dato: curso1){
            if (nombre.equals(dato.nombre) && sem.equals(dato.semestre)) {
                System.out.println(dato.materia + " " + dato.definitiva);
            }
        }


        curso2 = curso2a.lecturaDatos("NOTAS ST0245.CSV");

        for (Dato dato: curso2){
            if (nombre.equals(dato.nombre) && sem.equals(dato.semestre)) {
                System.out.println(dato.materia + " " + dato.definitiva);
            }
        }


        curso3 = curso3a.lecturaDatos("NOTAS ST0247.CSV");

        for (Dato dato: curso3){
            if (nombre.equals(dato.nombre) && sem.equals(dato.semestre)) {
                System.out.println(dato.materia + " " + dato.definitiva);
            }
        }

    }


}
