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
public class EjercicioFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroEmpleados = 0;
        int ingresoEmpleados = 0;
        float acumuladorIngreso = 0;
        float promedioIngreso = 0;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        numeroEmpleados = entrada.nextInt();
        
        for(int i=1;i<=numeroEmpleados;i++){
            System.out.println("Digite el ingreso del empleado: "+i);
            ingresoEmpleados = entrada.nextInt();
            acumuladorIngreso = acumuladorIngreso + ingresoEmpleados;
        }
        
        promedioIngreso = acumuladorIngreso/numeroEmpleados;
        System.out.println("El promedio de ingresos de "+ numeroEmpleados+" empleados es:");
        System.out.println(promedioIngreso);     
    }
    
}
