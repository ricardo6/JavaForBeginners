/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import java.util.Scanner;

/**
 *h=a2+b2
 * @author drupal
 */
public class Ejemplo7 {
    public static void main(String []args){
        System.out.println("Introdusca base");
        Scanner scanner=new Scanner(System.in);
        double base=scanner.nextDouble();
        
        System.out.println("Introdusca altura");
        Scanner scanner1=new Scanner(System.in);
        double altura=scanner1.nextDouble();
        double hipo=Math.sqrt(base*base+altura*altura);
        System.out.println("La hipotenusa es="+hipo);
    }
}
