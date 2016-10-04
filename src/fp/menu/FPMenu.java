/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import static fp.menu.FPMenu.area;
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
        String menu = null;
        
       System.out.println("La opcion elegida es" + menu);
       menu();
       calculaAreas();
       int a, b, pi, r;
       a=solicitarDato("A");
       b=solicitarDato("B");
       r=solicitarDato("Radio");
       
    }
    public static int menu (){
        int opcion;
        do{
        Scanner entrada=new Scanner (System.in);
        System.out.println("*** Calculo de Areas ****");
        System.out.println("*** Mune ****");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1. Area de Cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de Triangulos");
        System.out.println("0. Sailir.");
        opcion=entrada.nextInt();
        }while (opcion<=0 || opcion>=4);
        return opcion; 
    }
    public static float CalculaAreas(int op){
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
            case 4:
                area=mensajeSalida();
                    
                }
        return area;
        }
    public static int solicitarDato(String d){
        int miDato;
        System.out.println("Introduce el dato: " + d);
        Scanner teclado= new Scanner(System.in);
        miDato=teclado.nextInt();
        return miDato;
        }
    public static double area(int a, int b){
        int area
        areaCuadrado= a*b;
        areaTriangulo= (a*b)/2;
      
       
        
        return area;

    }
    public static double areaTriangulo(int a, int b){
        int areaTriangulo= (a*b)/2;
        return areaTriangulo;
        
    }
   public static double areaCirculo(int r, int p){
        double pi = 3.1416;
       int areaCirculo= (int) (pi*Math.pow(r,2));
       return areaCirculo;
   }
   public static void MensajeSalida(){
       System.out.println("Error");
       
   }
    }
