/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import java.util.Scanner;

/**
 * n=123
 * salida=1
 * salida=2
 * salida=3
 */
public class Ejemplo10 {
    public static void main(String[]args){
        System.out.println("Inter a number");
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        char pos1 = n.charAt(0);
        char pos2 = n.charAt(1);
        char pos3 = n.charAt(2);
        System.out.println(pos1);    
        System.out.println(pos2);    
        System.out.println(pos3);    
    }
}
