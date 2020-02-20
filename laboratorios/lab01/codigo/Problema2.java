
/**
 * Write a description of class Problema2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problema2
{
    public static int contenedor(int n){
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return contenedor(n-1) + contenedor(n-2);
    }
}
