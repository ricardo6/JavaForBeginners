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
public class Ejemplo2 {
    public static void main(String []args){
        System.out.println("Introduce tu nombre:");
        Scanner ss=new Scanner(System.in);
        String nombre=ss.nextLine();
        
        System.out.println("Introduce tu Apellido:");
        Scanner aa=new Scanner(System.in);
        String apellido=aa.nextLine();
        
        System.out.println("Introduce tu edad:");
        Scanner ee=new Scanner(System.in);
        int edad=ee.nextInt();
        System.out.println("Tu nombre es "+nombre);
        System.out.println("Tu Apellido es "+apellido);
        System.out.println("Tu edad es "+edad);
    }
}
