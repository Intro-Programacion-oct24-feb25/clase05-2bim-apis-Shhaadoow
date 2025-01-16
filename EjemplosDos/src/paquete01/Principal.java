/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String trabajo;
        String ubicacion;
        
        double[] misNotas;
        double promedio;
        double mejorNota;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        trabajo = DatoTrabajo.obtenerTrabajo();
        ubicacion = DatoTrabajo.obtenerTrabajoUbicacion();
        mejorNota = DatoFinal.obtenerMejorNota(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Trabajo: %s\n"
                + "Direccion de empresa %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n"
                + "La mejor nota es: %s\n",
                nombre,
                apellidoRetornado, trabajo, ubicacion, 
                ciudad,
                promedio, mejorNota);
    }
    
}
