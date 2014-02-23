/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.util.Scanner;

/**
 *     xn = xn-1 + xn-2
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
 * 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
 * 28657, 46368, 75025, 121393, 196418, 317811, ...
 * 
 */
public class Ejemplo9 {
    public static void main(String []args){
        System.out.println("ingrese un numero para serie fibunaci");
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int a=0;int b=1;int c;
       for (int i = 0; i <=n; i++) {
           c=a+b;
           a=b;
           b=c;
           System.out.println(a);    
       }
    }
}
