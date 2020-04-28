public class Ejecucion {
    public static void main(String[] args) {
        Arbol yo = new Arbol("David Restrepo Ramirez");
        yo.getRaiz().setPadre("Juan Fernando Restrepo Alzate");
        yo.getRaiz().setMadre("Alba Maria Ramirez Gomez");
        Nodo papa = yo.getRaiz().getPadre();
        Nodo mama = yo.getRaiz().getMadre();
        papa.setPadre("Fernando de Jesús Restrepo Uribe");
        papa.setMadre("Libia Margarita Alzate de Restrepo");
        mama.setPadre("Maximiliano Ramirez Montoya");
        mama.setMadre("Ana Maria Gomez Ramirez");
        Nodo abueloP = papa.getPadre();
        Nodo abuelaP = papa.getMadre();
        Nodo abueloM = mama.getPadre();
        Nodo abuelaM = mama.getMadre();
        abueloP.setPadre("Ni idea algo Restrepo");
        abueloP.setMadre("Ni idea algo Uribe");
        abuelaP.setPadre("Ni idea algo Alzate");
        abuelaP.setMadre("ni idea algo Suarez");
        abueloM.setPadre("Ni idea algo Ramirez");
        abueloM.setMadre("Ni idea algo Montoya");
        abuelaM.setPadre("Ni idea algo Gomez");
        abuelaM.setMadre("Ni idea algo Ramirez pero otro");
    }
}
