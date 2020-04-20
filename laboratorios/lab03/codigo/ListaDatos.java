import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaDatos {

    //Atributos
    LinkedList<Dato> stored = new LinkedList();

    //Métodos

    public LinkedList<Dato> lecturaDatos (String nombreArch) {

        try {
            Scanner archivo = new Scanner(new File(nombreArch));

            while (archivo.hasNextLine()) {

                String linea = archivo.nextLine();

                if(linea.length()>1) {
                    linea = linea.replaceAll(",,,", ",").replaceAll("\"2,","\"2.")
                            .replaceAll("\"0,","\"0.").replaceAll("\"1,","\"0.")
                            .replaceAll(",,", ",").replaceAll("\"", "")
                            .replaceAll("NULL", "");

                    String[] atributos = linea.split(",");

                    String nombre = atributos[0];
                    String preCod = atributos[1];
                    String codMateria = atributos[2];
                    String semestre = atributos[3];
                    String preGrup = atributos[4];
                    String evaluacion = atributos[5];
                    String prePorc = atributos[6];
                    String descripcion = atributos[7];
                    String materia = atributos[8];
                    String preNota = atributos[9];
                    String preDefin = atributos[8];

                    int codigo;
                    int grupo;
                    double porcentaje;
                    int nota;
                    int definitiva;

                    if (preCod.isEmpty()) preCod = "  X";
                    if (preGrup.isEmpty()) preGrup = "  X";
                    if (prePorc.isEmpty()) prePorc = "  X";
                    if (preNota.isEmpty()) preNota = "  X";
                    if (preDefin.isEmpty()) preDefin = "  X";

                    if (preCod.equals("  X")) {
                        codigo = -10000;
                    } else {
                        codigo = Integer.parseInt(preCod);
                    }

                    if (preGrup.equals("  X")) {
                        grupo = -10000;
                    } else {
                        grupo = Integer.parseInt(preGrup);
                    }

                    if (prePorc.equals("  X")) {
                        porcentaje = -10000;
                    } else {
                        porcentaje = Double.parseDouble(prePorc);
                    }

                    if (preNota.equals("  X")) {
                        nota = -10000;
                    } else {
                        nota = Integer.parseInt(preNota);
                    }

                    if (preDefin.equals("  X")) {
                        definitiva = -10000;
                    } else {
                        definitiva = Integer.parseInt(preDefin);
                    }

                    Dato dato = new Dato (nombre, codigo, codMateria, semestre,
                            grupo, evaluacion, porcentaje, descripcion, materia, nota,
                            definitiva);
                    stored.add(dato);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se pudo abrir");
        }
        return stored;
    }

}
