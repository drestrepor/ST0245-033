/**
 * Write a description of class Problema1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problema1
{
    public static int lcsAux(String x, String y){
        return lcs(x , y).length();
    }
    public static String lcs (String x, String y) {
        String aux = "";
        String max = "";
        if (x.equals("") || y.equals("")){
            return "";
        }
        if (x.equals(y)){
            return x;
        }
        else {  
             for (int i = 0; i < x.length(); i++){
                aux = "";
                for (int j = 0; j < y.length(); j++) {
                    if (x.charAt(i) == y.charAt(j)){
                        aux = x.charAt(i) + lcs(x.substring(i+1) , y.substring(j+1));
                    }
                }
                if (aux.length() >= max.length()){
                    max = aux;
                }
            }
        }
        return max;
    }
}
