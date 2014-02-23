/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author drupal
 */
public class Ejemplo6 {

    public static void main(String[]args){
        System.out.println("Intro primer número");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Intro segundo número");
        int b=scanner.nextInt();
        int res=sumar(a,b);
        System.out.println("La suma de "+a+" y "+b+"es="+res);
    }

    private static int sumar(int a, int b) {
        int suma;
        if (a==0) 
            return suma=b;
        else if(b==0)
            return suma=a; 
        else
           return suma=1+sumar(a,b-1);
    }
}
