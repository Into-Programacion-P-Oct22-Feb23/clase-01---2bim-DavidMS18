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
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sumaAcumulacion = 0;
        
        for (int i = 10; i <= 20; i += 2) {
            sumaAcumulacion = sumaAcumulacion + i; // 0 + 10
                                                   // 10 + 12
                                                   // 22 + 14
        }
        
        System.out.printf("%d\n", sumaAcumulacion);
        
    }
    
}
