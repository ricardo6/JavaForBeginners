/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

/**
 *número perfecto es si la suma de sus divisores es igual al mismo numero
 * numero = 6
 * ej: 1, 2 y 3; y 6 = 1 + 2 + 3
 * 
 */
public class Ejemplo6 {
    public static void main(String []args){
        int n=496;
        int suma=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                suma=suma+i;
            }
        }
        if (suma==n) {
            System.out.println("Es perfecto");
        }else System.out.println("No es perfecto");
    }
}
