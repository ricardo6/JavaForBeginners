/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;
import java.util.Scanner;

/**
 *Un año es bisiesto si el año es divisible entre 4 y 400 pero  no es divisible entre 100 
 * ej entrada a=1999
 *    caso uno:
 *           a % 4   ==0 
 *           a % 100 !=0
 *                  a es bisietro
 *    caso dos.
 *          a % 400=0.
 *                  a es bisiesto.
 *     
 */
/*
public class AnioBisiesto {
    public static void main(String []args){
        System.out.println("introduce un año para saber si es bisieso o no|");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a%4==0){
            if(a%100==0){
                if (a%400==0) {
                    System.out.println("es bisiesto:"+a);
                }else System.out.println("No es bisiesto");
            }else System.out.println("Es bisiesto");
        }else System.out.println("No es bisiesto");
    }
}*/

// mejor solucvion 
public class AnioBisiesto {
    public static void main(String []args){
        System.out.println("introduce un año para saber si es bisieso o no|");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a<1) 
            System.out.println("Año antes de cristo.....:"+a*(-1));
        else{
            if ((a%4==0&&a%100!=0)||a%400==0)
            System.out.println("es bisiesto:"+a);
            else System.out.println("No es bisiesto:"+a);
        }
    }
}