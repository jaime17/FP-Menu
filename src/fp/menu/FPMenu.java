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
        System.out.println("La opcion elegida es");
    }
    public static int menu (){
        int opcion;
        Scanner entrada=new Scanner (System.in);
        System.out.println("*** Calculo de Areas ****");
        System.out.println("*** Mune ****");
        System.out.println("Introduce la opcion deseada");
        System.out.println("1. Area de Cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de Triangulos");
        opcion=entrada.nextInt();
        return opcion; 
    }
}