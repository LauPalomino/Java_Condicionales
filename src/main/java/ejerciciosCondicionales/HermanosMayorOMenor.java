/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosCondicionales;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class HermanosMayorOMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreHermano1 = "";
        String nombreHermano2 = "";
        int edadHermano1 = 0;
        int edadHermano2 = 0;
        int edadHMayor = 0;
        int edadHMenor = 0;
        String mayor= "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hermano 1: ");
        nombreHermano1 = entrada.nextLine();
        System.out.println("Ingrese el nombre del hermano 2: ");
        nombreHermano2 = entrada.nextLine();
        System.out.println("Ingrese la edad del hermano 1: ");
        edadHermano1 = entrada.nextInt();
        System.out.println("Ingrese la edad del hermano 2: ");
        edadHermano2 = entrada.nextInt();
        
        if(edadHermano1<edadHermano2){
            mayor = nombreHermano2;
            edadHMayor = edadHermano2;
            edadHMenor = edadHermano1;
        }
        else {
            if(edadHermano1==edadHermano2){
                mayor = "Gemelos o Mellizos";
            }
            else if (edadHermano1>edadHermano2){
                mayor= nombreHermano1;
                edadHMayor = edadHermano1;
                edadHMenor = edadHermano2;
            }
        }
        
        System.out.println("El hermano mayor es: "+ mayor);
        System.out.println("La diferencia de edad es: "+ (edadHMayor - edadHMenor));
                
    }
    
}
