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
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m;
        int n;
        double suma = 0;
        System.out.println("ingrese valor de m:");
        m = entrada.nextInt();
        System.out.println("ingrese valor de n:");
        n = entrada.nextInt();

        if (m > 0 && n > 0) {
            if (m < n) {
                while (m <= n) {
                    suma = suma + Math.pow(m, 2);
                    m = m + 1;
                }
                System.out.println(suma);
            } else {
                System.out.println("Error");
            }

        } else {
            System.out.println("Error");
        }

    }
}
