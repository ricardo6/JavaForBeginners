/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo3 {
    public static void main(String []args){
        System.out.println("Introduce un numero");
        Scanner scanner=new Scanner(System.in);
        int numero=scanner.nextInt();    
        System.out.println("numero:"+numero);
        System.out.println("doble:"+numero*2);
        System.out.println("triple:"+numero*3);
    }
}
