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
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 0;
        int B = 1;
        int C = 0;
        int n;
        int i = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese hasta que número quiere la serie: ");
        n= entrada.nextInt();
        while (C<=n){
            A = B;
            B = C;
            C = A + B;
            if (C<=n){
                System.out.println(i + C);
            }
        }
    }
    
}
