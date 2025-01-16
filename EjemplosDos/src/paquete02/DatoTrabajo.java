/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String obtenerTrabajo(){
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
        System.out.println("Ingrese su lugar de trabajo");
        String lugarTrabajo = entrada.nextLine();
        
        return lugarTrabajo;
    }
    // método que permita preguntar al usuario la dirección de la empresa
    public static String obtenerTrabajoUbicacion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su ubicacion de trabajo");
        String lugarTrabajoUbi = entrada.nextLine();
        
        return lugarTrabajoUbi;
    }
}
