package ExamenUnidad2JAMC;

public class Ejercicio2Hogar {
    
    public int[] ordenacionXInsercionD(int[] vector){
            int aux, j;
            for (int i = 1; i < vector.length; i++) {
                aux=vector[i];
                j=i;
                while(j>0 && aux<vector[j-1]){
                vector[j]=vector[j-1];
                j--;
                }
                vector[j]=aux;
            }        
        return vector;
    }
    public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }    
    public static void main(String[] args) {
        Ejercicio2Hogar rer=new Ejercicio2Hogar();
        int[] vector={2,6,1,3,4};   
        rer.imprimir(rer.ordenacionXInsercionD(vector));
        System.out.println("new met...");
    }
}