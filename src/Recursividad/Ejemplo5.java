/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursividad;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo5 {
    public static void main(String[]args){
        System.out.println("hasta cuanto quiere sumar n??");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=sumar(n);
        System.out.println("La suma de 1 hasta "+n+" es="+res);
    }

    private static int sumar(int n) {
        int res;
        if(n==1)
            return res=1;
        else return res=n+sumar(n-1);
    }
}
