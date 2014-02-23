/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

/**
 *
 * @author drupal
 */
public class Ejemplo7 {
    public static void main(String []args){
        for (int n = 1; n <=1000; n++) {
            int suma=0;
            for (int i = 1; i < n; i++) {
                if (n%i==0) {
                    suma=suma+i;
                }
            }
            if (suma==n) {
                System.out.println(n);
            }
        }
    }
}
