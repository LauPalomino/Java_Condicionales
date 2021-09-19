/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjercicioSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalDevengado = 0;
        int nivelRiesgo = 0;
        float ibc = 0;
        float pagoSalud = 0;
        double pagoPension = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el total devengado: ");
        totalDevengado = entrada.nextInt();
        
        ibc = EjercicioSocial.getIbc(totalDevengado);
        pagoSalud = EjercicioSocial.getSalud(ibc);
        pagoPension = EjercicioSocial.getPension(ibc);
        System.out.println("El ingreso base de cotización (IBC) es de: " + ibc);
        System.out.println("El pago por salud es : " + pagoSalud);
        System.out.println("El pago por pensión es : " + pagoPension);
    }
    
    public static float getIbc(int totalDevengadoIn){
        float ibcOut = 0;
        ibcOut = (totalDevengadoIn * 40)/100;
        return ibcOut;
    }
    
    public static float getSalud(float ibcIn){
        float saludOut= 0;
        saludOut= (ibcIn*12)/100;
        return saludOut;
    }
    
    public static double getPension(float ibcIn){
        double pensionOut = 0;
        pensionOut = ibcIn*0.16;
        return pensionOut;
    }
}
