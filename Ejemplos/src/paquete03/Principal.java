/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.imprimir1;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
     imprimir1.imprimirMensaje(valorA, valorB, suma, multiplicacion);
     // Estamos llmanddo a un procedimiento llamado imprimirMesnaje que esta en
     // el paquete 06 creado en una clase llamada imprimir1, le enviamos 4 
     // parametros para que imprima el resultado.
    }
}
