package ExamenUnidad2JAMC;

import java.util.Scanner;

public class GerenteJAMC {
    
    public static void Ejercicio1(){
        double imp = 0, ej_11, valor, r;
        int clave, nve;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Valor del vehículo: ");
        valor = leer.nextDouble();
        
        System.out.println("¿Cuantos vehículos pretende adquirir?: ");
        nve = leer.nextInt();
        
        System.out.println("Clave de los vehiculos: ");
        clave=leer.nextInt();
        
        ej_11=valor*nve*clave;
        switch (clave) {
            case 1:
                imp=ej_11*10/100;
                break;
            case 2:
                imp=ej_11*7/100;
                break;  
            case 3:
                imp=ej_11*5/100;
                break;
            default:
        String Imp = "incalculable";
                break;
        }
        r=imp+valor;
        System.out.println("La cantidad total a pagar es:"+r+"S/.");
    }
    
    public static void main(String[] args) {
    
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: Ejercicio1(); break;
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
}