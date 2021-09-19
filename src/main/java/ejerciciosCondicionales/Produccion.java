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
public class Produccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String incentivo = ""; 
        int bono= 0;  
        String diaSemana="";
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número para conocer el día: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese las unidades generadas: ");
        int unidadesGeneradas = entrada.nextInt();
        if (dia==1){
            diaSemana = ("Lunes");
        }
        else if (dia==2){
            diaSemana = ("Martes");
        }
        else if (dia==3){
            diaSemana = ("Miercoles");
        }
        else if (dia==4){
            diaSemana = ("Jueves");
        }
        else if (dia==5){
            diaSemana = ("Viernes");
        }
        else if (dia==6){
            diaSemana = ("Sábado");
        }
        else{
            diaSemana = ("No es día laboral");
        }
        
        if(unidadesGeneradas>100){
            incentivo = "200000";
        }
        else{
            if (unidadesGeneradas>80 && unidadesGeneradas<=100){
                incentivo= "Descansa el día Sábado";
            }
            else if (unidadesGeneradas<79){
                incentivo= "No recibirá ningún incentivo";
            }
        }
        System.out.println("Días laborados: "+ diaSemana);
        System.out.println("Sus unidades Generadas fueron: "+ unidadesGeneradas);
        System.out.println("Su incentivo es: "+ incentivo);
    }
    
}
