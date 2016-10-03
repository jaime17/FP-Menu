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
        String menu = null;
        
       System.out.println("La opcion elegida es" + menu);
       menu();
       calculaAreas();
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
    public static area(){
        
    }
    }
