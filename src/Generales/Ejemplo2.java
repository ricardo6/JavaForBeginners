/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.util.Scanner;

/**
 *
 *  
 */
public class Ejemplo2 {
    public static void main(String[]args){
        System.out.println("Ingrese un número");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int contador=0;
        while (n>0) {            
            contador=contador+1;
            n=n/10;
        }
        System.out.println("n="+contador);
    }
}
