/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author jaime
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Forma 1
      /*int m;
      float a;
      m=menu();
      a=calculaAreas(m);
      muestraResultado(a,m);*/
      //forma
      muestraResultado(calculaAreas(menu()));
      
      
       
    }
    public static int menu (){
        int opcion;
        do{
        Scanner entrada=new Scanner (System.in);
        System.out.println("*** Calculo de Areas ****");
        System.out.println("*** Menu ****");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1. Area de Cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de Triangulos");
        System.out.println("0. Sailir.");
        opcion=entrada.nextInt();
        }while (opcion<=0 || opcion>=4);
        return opcion; 
    }
    public static float calculaAreas(int op){
        float area;
        switch (op){
            case 1:
                area=areaCuadrado();
                break;
            case 2:
                area=areaCirculo();
                break;
            case 3:
                area=areaTriangulo();
                break;
            default:
                mensajeSalida();
                area=0;    
                }
        return area;
        }
    public static double solicitarDatos(String tipo){
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el valor de " + tipo + " : ");
        dato = entrada.nextDouble();
        return dato;
}
    public static float areaCuadrado(){
        float area;
        double a;
        a = solicitarDatos("un lado");
        area = (float) Math.pow(a, 2); 
        return area;
}
    
   public static float areaCirculo(){
       float area;
       double r;
       final double pi;
       pi= 3.1416;
       r= solicitarDatos ("el radio");
       area= (float) (pi*Math.pow(r,2));
       return area;
   }
   public static float areaTriangulo(){
        float area;
        double a,b;   
        a= solicitarDatos ("altura");
        b= solicitarDatos ("base");
        area=(float) ((a*b)/2);
        return area;
        
    }
   public static void mensajeSalida(){
       System.out.println("Error");
       System.exit(0);
   }
   public static void muestraResultado (float area){
       System.out.println("El area es: " + area);
   }
   public static void muestraResultado(float area, int r){
       String figura;
       if (r == 1) { figura= "cuadrado ";}
       else{
               if (r == 2) {figura= "Circulo ";
               } else{ figura= "triangulo ";
                 
               }
       }
       System.out.println("el area del " + figura + "es igual a: " + area);
       
   }

    
       
    }
