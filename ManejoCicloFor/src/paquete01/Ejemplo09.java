/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {
    public static void main(String[] args) {
                
        for (int i = 5; i >= 1; i--) {
            for (int contador = 1; contador <= i; contador++) {
                
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        
        
    }
}
