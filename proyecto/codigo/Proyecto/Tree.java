//NEW
public class Tree {
    public Node root;

    public Tree(Node root){
        this.root = root;
    }

    @Override
    public String toString(){
        return "La impureza es: " + root.impureza+" La matriz de impurezas es: "+root.impurezas
                +", El exito es: "+root.exito+" Está en la variable(algo): "+root.algo+" La variable es: "+
                root.variable+ " Y la matriz es: "+root.matriz;
    }
}
