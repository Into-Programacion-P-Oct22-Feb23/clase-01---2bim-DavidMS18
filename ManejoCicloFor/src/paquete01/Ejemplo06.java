/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tabla;
        int operacion;
        String cadenaFinal = "";
        System.out.println("Ingrese la tabla a generar");
        tabla = entrada.nextInt(); // 7
        
        for (int contador = 5; contador <= 12; contador++) {
            operacion = tabla * contador; // 7*5 = 35 // 7*6 = 42
            // System.out.printf("%d x %d = %d\n", tabla, contador, operacion);
            cadenaFinal = String.format("%s%d x %d = %d\n", 
                    cadenaFinal, 
                    tabla, 
                    contador, 
                    operacion);
            
        }
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
}
