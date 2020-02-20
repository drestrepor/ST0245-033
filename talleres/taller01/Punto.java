
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Punto
{
    //Atributos
    
    private double coordenadaX;
    private double coordenadaY;
    
    //Constructor
    
    public Punto () {
        coordenadaX = 0;
        coordenadaY = 0;
    }
    
    public Punto (double x, double y) {
        coordenadaX = x;
        coordenadaY = y;
    }
    
    //Mètodos
    
    public void setX (double x) {
        coordenadaX = x;
    }
    
    public void setY (double y) {
        coordenadaY = y;
    }
    
    public double getX () {
        return coordenadaX;
    }
    
    public double getY () {
        return coordenadaY;
    }
    
    public double getAngulo () {
        return Math.atan(coordenadaY/coordenadaX);
    }
    
    public double distanciaEuclidiana (Punto a) {
        return Math.sqrt(Math.pow(coordenadaX - a.getX() , 2) + Math.pow(coordenadaY - a.getY() , 2));
    }
    
    public double radioPolar(double x , double y){
	double elRadioPolar = Math.sqrt(x*x + y*y);
	return elRadioPolar;
}
}
