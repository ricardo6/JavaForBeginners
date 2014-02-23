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
public class Ejemplo4 {
    public static void main(String[]args){
        System.out.println("Inter a number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=calcular(n);
        System.out.println(n+"numero de cifras="+res);
    }

    private static int calcular(int n) {
        int res;
        if(n<10)
          return res=1;
        else return res=1+calcular(n/10);
    }
}
