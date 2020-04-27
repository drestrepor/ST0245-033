import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Scanner;

public class TecladoRoto {
    //Atributos
    static LinkedList<String> texto =  new LinkedList<String>();

    //Métodos
    public static void main(String[] args) {
        procesarLinea("[[a[[d[f[[g[g[h[h[dgd[fgsfa[f");
        int size = texto.size();
        for (int i = 0; i < size; i++) {
            System.out.print(texto.removeFirst());
        }
    }

    public static void procesarLinea (String linea) {
        if (linea.contains("[") && linea.contains("]")) {
            if((linea.indexOf("[") < linea.lastIndexOf("[")) || (linea.indexOf("]") < linea.lastIndexOf("]"))) {
                if (linea.indexOf("[") < linea.indexOf("]")) {
                    if (linea.indexOf("[" , linea.indexOf("[")+1) < linea.indexOf("]")) {
                        System.out.println("Lalala");
                        System.out.println(linea);
                        System.out.println(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
                        texto.addFirst(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
                        System.out.println(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[", linea.indexOf("[")+1)));
                        procesarLinea(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[", linea.indexOf("[")+1)));
                    } else {
                        System.out.println("Kill");
                        System.out.println(linea);
                        System.out.println(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("]")));
                        System.out.println(linea.substring(0 , linea.indexOf("[")) + linea.substring(linea.indexOf("]")));
                        texto.addFirst(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("]")));
                        texto.add(linea.substring(0 , linea.indexOf("[")));
                        procesarLinea(linea.substring(linea.indexOf("]")));
                    }
                }else
                if(linea.indexOf("[") < linea.indexOf("]" , linea.indexOf("]")+1)) {
                    System.out.println("Pork");
                    System.out.println(linea);
                    System.out.println(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("[")));
                    System.out.println(linea.substring(0, linea.indexOf("]")) + linea.substring(linea.indexOf("[", linea.indexOf("["))));
                    texto.add(linea.substring(0 , linea.indexOf("]")));
                    texto.addLast(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("[")));
                    procesarLinea(linea.substring(linea.indexOf("[", linea.indexOf("["))));

                }else {
                    System.out.println("Papi");
                    System.out.println(linea);
                    System.out.println(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("]" , linea.indexOf("]")+1)));
                    System.out.println(linea.substring(0 , linea.indexOf("]")) + linea.substring(linea.indexOf("]" , linea.indexOf("]")+1)));
                    texto.addLast(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("]" , linea.indexOf("]")+1)));
                    procesarLinea(linea.substring(0 , linea.indexOf("]")) + linea.substring(linea.indexOf("]" , linea.indexOf("]")+1)));
                }
            }else
            if (linea.indexOf("[") < linea.lastIndexOf("[")) {
                texto.addFirst(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
                System.out.println("Pa");
                System.out.println(linea);
                System.out.println(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
                System.out.println(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[" , linea.indexOf("[")) + 1));
                procesarLinea(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[" , linea.indexOf("[")) + 1));
            }else if (linea.indexOf("]") < linea.lastIndexOf("]")) {
                texto.addFirst(linea.substring(linea.indexOf("[") + 1, linea.indexOf("]", linea.indexOf("]") + 1)));
                System.out.println("Pe");
                System.out.println(linea);
                System.out.println(linea.substring(linea.indexOf("[") + 1, linea.indexOf("]", linea.indexOf("]") + 1)));
                System.out.println(linea.substring(0, linea.indexOf(("["))) + linea.substring(linea.indexOf("]" , linea.indexOf("]")+1)));
                procesarLinea(linea.substring(0, linea.indexOf(("["))) + linea.substring(linea.indexOf("]" , linea.indexOf("]")+1)));
            }else {
                texto.addFirst(linea.substring(linea.indexOf("[") + 1, linea.indexOf("]")));
                System.out.println("Pi");
                System.out.println(linea.substring(linea.indexOf("[") + 1, linea.indexOf("]")));
                System.out.println(linea);
                System.out.println(linea.substring(linea.indexOf("]")+1 ));
                System.out.println(linea.substring(0 , linea.indexOf("[")));
                procesarLinea(linea.substring(0 , linea.indexOf("[")) + linea.substring(linea.indexOf("]")+1));
            }

        }else
        if (linea.indexOf("[") < linea.lastIndexOf("[")) {
            System.out.println("Lalalo");
            System.out.println(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
            System.out.println(linea);
            System.out.println(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[" , linea.indexOf("[")+1)));
            texto.addFirst(linea.substring(linea.indexOf("[") + 1 , linea.indexOf("[" , linea.indexOf("[")+1)));
            procesarLinea(linea.substring(0, linea.indexOf("[")) + linea.substring(linea.indexOf("[" , linea.indexOf("[")+1)));
        }else
        if (linea.contains("[")) {
            System.out.println("Lalalu");
            System.out.println(linea);
            System.out.println(linea.substring(linea.indexOf("[")+1));
            System.out.println(linea.substring(0, linea.indexOf("[")));
            texto.addFirst(linea.substring(linea.indexOf("[")+1));
            procesarLinea(linea.substring(0, linea.indexOf("[")));
        }else
        if (linea.indexOf("]") < linea.lastIndexOf("]")) {
            System.out.println("Lalale");
            texto.addLast(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("]" , linea.indexOf("]")+1)));
            System.out.println(linea.substring(linea.indexOf("]") + 1 , linea.indexOf("]" , linea.indexOf("]")+1)));
            System.out.println(linea);
            System.out.println(linea.substring(0, linea.indexOf("]")) + linea.substring(linea.indexOf("]" , linea.indexOf("]")) + 1));
            procesarLinea(linea.substring(0, linea.indexOf("]")) + linea.substring(linea.indexOf("]" , linea.indexOf("]")) + 1));
        }else
        if (linea.contains("]")) {
            System.out.println("Lalali");
            texto.addLast(linea.substring(linea.indexOf("]") + 1));
            System.out.println(linea.substring(linea.indexOf("]") + 1));
            procesarLinea(linea.substring(0, linea.indexOf("]")));
        }else
        if (!(linea.contains("[")) && (!(linea.contains("]")))) {
            System.out.println("La");
            texto.addLast(linea);
        }
    }

}
