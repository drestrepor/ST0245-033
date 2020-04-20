public class Dato {

    //Atributos
    String nombre;
    int codigo;
    String codMateria;
    String semestre;
    int grupo;
    String evaluacion;
    double porcentaje;
    String descripcion;
    int nota;
    String materia;
    int definitiva;


    //Constructor
    public Dato(String nombre, int codigo, String codMateria, String semestre, int grupo, String evaluacion,
                double porcentaje, String descripcion, String materia, int nota, int definitiva) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.codMateria = codMateria;
        this.semestre = semestre;
        this.grupo = grupo;
        this.evaluacion = evaluacion;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.materia = materia;
        this.nota = nota;
        this.definitiva = definitiva;
    }

}
