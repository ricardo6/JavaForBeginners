/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import java.util.Scanner;

/**
 *n=1234
 * salida=4
 * salida=3
 * salida=2
 * salida=1
 */
public class Ejemplo12 {
    public static void main(String[]args){
        System.out.println("Infte a number with 5 digts");
        Scanner scanner=new Scanner(System.in);
        String num=scanner.nextLine();
        
        char pos1=num.charAt(0);
        char pos2=num.charAt(1);
        char pos3=num.charAt(2);
        char pos4=num.charAt(3);
        char pos5=num.charAt(4);
        
        System.out.println(pos5);
        System.out.println(pos4);
        System.out.println(pos3);
        System.out.println(pos2);
        System.out.println(pos1);
    }
}
