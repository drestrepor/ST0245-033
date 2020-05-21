//NEW
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Code for Data Structures and Algoritms 1
 * final project.
 *
 * @author David Restrepo, Juan Felipe Lopez
 */

public class Lectura {
    static ArrayList<Dato> datos = new ArrayList<>();
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        long inicio = System.currentTimeMillis();

        leer_archivo(seleccionarDataset());
        int exito[] = llenarexito();
        String matriz[][] = recolectarDatos();

        Node raizDelArbol = new Node(matriz, exito);
        Tree tree = new Tree(raizDelArbol);

        System.out.println("Aquí está la raiz " + tree.toString());

        long fin = System.currentTimeMillis();
        long total = fin - inicio;

        System.out.println("Tiempo de ejecucion total: " + total + "ms");
        System.out.println();
        System.out.println("Memoria usada para todo el programa:");
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
        System.out.println("MB: " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024)/1024);
    }

    /**
     * This method processes the datasets.
     * @param data es el name of the .csv file to process.
     */
    public static void leer_archivo(String data) {
        long inicio_leer = System.currentTimeMillis();
        try {
            PrintWriter writer = new PrintWriter("Datos.txt");
            File file = new File(data);
            Scanner scan = new Scanner(file);
            writer.println("estu_consecutivo.1  estu_exterior  periodo estu_tieneetnia estu_tomo_cursopreparacion" +  "estu_cursodocentesies   estu_cursoiesapoyoexterno   estu_cursoiesexterna" +
                    "estu_simulacrotipoicfes estu_actividadrefuerzoareas estu_actividadrefuerzogeneric   fami_trabajolaborpadre  fami_trabajolabormadre  fami_numlibros  estu_inst_cod_departamento" +
                    "estu_tipodocumento.1    estu_nacionalidad.1 estu_genero.1   estu_fechanacimiento.1  periodo.1   estu_estudiante.1   estu_pais_reside.1  estu_depto_reside.1 estu_cod_reside_depto.1" +
                    "estu_mcpio_reside.1 estu_cod_reside_mcpio.1 estu_areareside estu_valorpensioncolegio    fami_educacionpadre.1   fami_educacionmadre.1   fami_ocupacionpadre.1   fami_ocupacionmadre.1 " +
                    "  fami_estratovivienda.1  fami_nivelsisben    fami_pisoshogar fami_tieneinternet.1    fami_tienecomputador.1  fami_tienemicroondas    fami_tienehorno fami_tieneautomovil.1   fami_tienedvd " +
                    "  fami_tiene_nevera.1 fami_tiene_celular.1    fami_telefono.1 fami_ingresofmiliarmensual  estu_trabajaactualmente estu_antecedentes   estu_expectativas   cole_codigo_icfes   cole_cod_dane_establecimiento " +
                    "  cole_nombre_establecimiento cole_genero cole_naturaleza cole_calendario cole_bilingue   cole_caracter   cole_cod_dane_sede  cole_nombre_sede    cole_sede_principal cole_area_ubicacion cole_jornada    cole_cod_mcpio_ubicacion    cole_mcpio_ubicacion    cole_cod_depto_ubicacion " +
                    "   cole_depto_ubicacion    punt_lenguaje   punt_matematicas    punt_biologia   punt_quimica    punt_fisica punt_ciencias_sociales  punt_filosofia  punt_ingles desemp_ingles   profundiza  puntaje_prof    desemp_prof exito");
            scan.nextLine();
            String[] str = new String[78];
            System.out.println("estu_consecutivo.1  estu_exterior  periodo estu_tieneetnia estu_tomo_cursopreparacion" +  "estu_cursodocentesies   estu_cursoiesapoyoexterno   estu_cursoiesexterna" +
                    "estu_simulacrotipoicfes estu_actividadrefuerzoareas estu_actividadrefuerzogeneric   fami_trabajolaborpadre  fami_trabajolabormadre  fami_numlibros  estu_inst_cod_departamento" +
                    "estu_tipodocumento.1    estu_nacionalidad.1 estu_genero.1   estu_fechanacimiento.1  periodo.1   estu_estudiante.1   estu_pais_reside.1  estu_depto_reside.1 estu_cod_reside_depto.1" +
                    "estu_mcpio_reside.1 estu_cod_reside_mcpio.1 estu_areareside estu_valorpensioncolegio    fami_educacionpadre.1   fami_educacionmadre.1   fami_ocupacionpadre.1   fami_ocupacionmadre.1 " +
                    "  fami_estratovivienda.1  fami_nivelsisben    fami_pisoshogar fami_tieneinternet.1    fami_tienecomputador.1  fami_tienemicroondas    fami_tienehorno fami_tieneautomovil.1   fami_tienedvd " +
                    "  fami_tiene_nevera.1 fami_tiene_celular.1    fami_telefono.1 fami_ingresofmiliarmensual  estu_trabajaactualmente estu_antecedentes   estu_expectativas   cole_codigo_icfes   cole_cod_dane_establecimiento " +
                    "  cole_nombre_establecimiento cole_genero cole_naturaleza cole_calendario cole_bilingue   cole_caracter   cole_cod_dane_sede  cole_nombre_sede    cole_sede_principal cole_area_ubicacion cole_jornada    cole_cod_mcpio_ubicacion    cole_mcpio_ubicacion    cole_cod_depto_ubicacion " +
                    "   cole_depto_ubicacion    punt_lenguaje   punt_matematicas    punt_biologia   punt_quimica    punt_fisica punt_ciencias_sociales  punt_filosofia  punt_ingles desemp_ingles   profundiza  puntaje_prof    desemp_prof exito");
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] test = line.split(",");
                for (int j = 0; j < str.length; j++) {
                    if (j >= test.length) {
                        str[j] = "";
                    } else {
                        str[j] = test[j];
                    }
                }

                datos.add(new Dato(str[0], str[1],
                        str[2], str[3],
                        str[4], str[5], str[6], str[7], str[8], str[9],
                        str[10], str[11], str[12], str[13], str[14], str[15],
                        str[16], str[17], str[18], str[19], str[20], str[21],
                        str[22], str[23], str[24], str[25], str[26], str[27],
                        str[28], str[29], str[30], str[31], str[32], str[33],
                        str[34], str[35], str[36], str[37], str[38], str[39],
                        str[40], str[41], str[42], str[43], str[44], str[45],
                        str[46], str[47], str[48], str[49], str[50], str[51],
                        str[52], str[53], str[54], str[55], str[56], str[57],
                        str[58], str[59], str[60], str[61], str[62], str[63],
                        str[64], str[65], str[66], str[67], str[68], str[69],
                        str[70], str[71], str[72], str[73], str[74], str[75],
                        str[76] , str[77]));
                for (String s : str) {
                    System.out.print(s + "\t\t\t  ");
                    writer.print(s + " \t\t\t ");
                }
                System.out.println();
                writer.println();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("No encontado" + e.toString());
        }

        long fin_leer = System.currentTimeMillis();
        long total_leer = fin_leer - inicio_leer;
        System.out.println("Tiempo de ejecucion de leer_archivo: " + total_leer + "ms");
        System.out.println();
        System.out.println("Memoria usada para leer_archivo:");
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
        System.out.println("MB: " + (double) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024)/1024);
    }

    /**
     * This method allows the user to interact
     * with the program to select a dataset to process.
     */
    public static String seleccionarDataset() {
        long inicio_selec = System.currentTimeMillis();
        Scanner teclado = new Scanner(System.in);
        String fst = "0_test_balanced_5000.csv";
        String snd = "0_train_balanced_15000.csv";
        System.out.println("Seleccione el dataset que desea usar.");
        System.out.println("1. " + fst);
        System.out.println("2. " + snd);
        String data = "";
        int a = 0;
        do {
            try {
                a = Integer.parseInt(teclado.nextLine());
                switch (a) {
                    case 1:
                        data = fst;
                        break;
                    case 2:
                        data = snd;
                        break;
                    default:
                        a = 0;
                        throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("El valor ingresado no es valido. \nIntente nuevamente.");
            }
        } while (a == 0);
        long fin_selec = System.currentTimeMillis();
        long total_selec = fin_selec - inicio_selec;
        System.out.println("Tiempo de ejecución para seleccionarDataset(): " + total_selec + "ms");

        return data;
    }

    /**
     * This methods fills the data from the dataset
     * into a matrix for making it easier to process.
     * @throws Exception
     */
    public static String[][] recolectarDatos() throws Exception {
        long inicio_recol = System.currentTimeMillis();

        //Metodo para llenar la matriz
        int filas = datos.size();
        String[][] matriz5 = new String[filas][76];
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < 76; j++) {
                matriz5[i][j] = datos.get(i).getValue(j);
            }
        }
        //Metodo para imprimir la matriz, puede borrarse si no necesita ser imprimida
        /*
         for (int i = 0; i < filas ; i++) {
         for (int j = 0; j < 6; j++) {
         System.out.print(matriz5[i][j]+"\t");
         }
         System.out.println();
         }*/
        long fin_recol = System.currentTimeMillis();
        long total_recol = fin_recol - inicio_recol;
        System.out.println("Tiempo de ejecución para recolectarDatos(): " + total_recol + "ms");
        return matriz5;
    }

    /**
     * This method fills a matrix with
     * the exitos processed by the program.
     * @return matrix with exitos.
     */
    public static int[] llenarexito() {
        long inicio_llenar = System.currentTimeMillis();

        int exito5 [];
        int filas = datos.size();
        exito5 = new int [filas];
        for (int i = 0; i < filas ; i++) {
            if (String.valueOf(datos.get(i).getExito()).compareToIgnoreCase("yes") == 0) {
                exito5[i] = 1;
            } else {
                exito5[i]=0;

            }
        }
        //Metodo para imprimir la matriz, puede borrarse si no necesita ser imprimida

        /*for (int a: exito5
         ) {
         System.out.println(a);
         }*/

        long fin_llenar = System.currentTimeMillis();
        long total_llenar = fin_llenar - inicio_llenar;
        System.out.println("Tiempo de ejecución para llenarexito(): " + total_llenar + "ms");

        return exito5;
    }
}
