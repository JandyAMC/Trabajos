package ExamenUnidad2JAMC;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Ejercicio3{

 
    public int[] ordenacionDecreciente1(int[] vec){
        int aux, j;
        for (int i = 1; i < vec.length; i++) {
            aux=vec[i];
            j=i;
            while(j>0 && aux>vec[j-1]){
            vec[j]=vec[j-1];
            j--;
            }
            vec[j]=aux;
        }        
    return vec;
    }
   public int[] creciente(int[] vector){
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
    public static void Efecto() {
       double xD= 0;
        int[] vector={42,57,14,40,96,8,68,1,4};
        Scanner leer=new Scanner(System.in);
        System.out.println("precione : ");
        System.out.println("decreciente  = 1 ");
        System.out.println("creciente    = 2 ");
        xD=leer.nextInt();  
        Ejercicio3 or=new Ejercicio3(); 
        if(xD==1){ 
        or.imprimir(or.ordenacionDecreciente1(vector));}
        else if (xD==2){
        or.imprimir(or.creciente(vector));}
    }
    
}