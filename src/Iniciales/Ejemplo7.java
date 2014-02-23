/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciales;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo7 {
    public static void main(String []args){
        System.out.println("Introduce un numero");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println((n<0)?"Negativo":"Positivo");
        System.out.println((n%2==0)?"Par":"Impar");
        System.out.println((n%5==0)?"Es Multiplo de 5":"No es multiplo de 5");
        System.out.println((n%10==0&&n<100)?"es multiplo de 10 y es menor a 100":"No es multiplo de 10 y es mayor a 100");
    }
}
