/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.util.Scanner;

/**
 * decimal to binary
 * 23=00...
 */
public class Ejemplo10 {
    public void decimalToBinary(int n){
        int []binary=new int [n];
        int index=0;
        while (n>0) {            
            binary[index++]=n%2;
            n=n/2;
        }
        for (int i = index-1; i >=0; i--) {
            System.out.print(binary[i]);
        }
    }
    public static void main(String[]args){
       System.out.println("Introduce un numero decimal:");
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       Ejemplo10 e10=new Ejemplo10();
       e10.decimalToBinary(n);
    }
}
