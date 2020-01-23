
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    //Atributos
    
    private int dia;
    private int mes;
    private int año;
    
    //Constructor
    
    public Fecha (int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    //Métodos
    
    public int getDia () {
        return dia;
    }
    
    public int getMes () {
        return mes;
    }
    
    public int getAño () {
        return año;
    }
    
    public int igual (Fecha a) {
        if (dia == a.getDia() && mes == a.getMes() && año == a.getAño()) {
            return 0;
        }
        else if(dia < a.getDia() && mes < a.getMes() && año < a.getAño()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
