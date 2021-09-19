/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasIterativas;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class While_do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tabla del 7");
        int i = 0;
        while(i<=10){
            System.out.println("7X"+i+"= "+7*i);
            i++;       
        }
        
        System.out.println("Tabla del 9");
        int k = 0;
        do{
            System.out.println("9X"+k+"= "+9*k);
            k++;
        }while(k<=10);
    }
    
}
