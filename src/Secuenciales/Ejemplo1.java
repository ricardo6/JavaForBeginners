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
public class Ejemplo1 {
    public static void main(String []args){
        System.out.println("Introduce primer numero");
        Scanner scanner1=new Scanner(System.in);
        int n1=scanner1.nextInt();
        System.out.println("Introduce segundo numero");
        Scanner scanner2=new Scanner(System.in);
        int n2=scanner2.nextInt();
        System.out.println("Tus numeros son:"+n1+";"+n2);
    }
}
