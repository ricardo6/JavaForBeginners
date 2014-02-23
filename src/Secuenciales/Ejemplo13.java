/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import java.util.Scanner;

/**
 *ej.: 721987===07/02/2987
 * paso1=7+2+1987=1996
 * paso2=1+9+9+6=25 tu numero
 */
public class Ejemplo13 {
    public static void main(String []args){
        System.out.println("Introduce tu fecha nacimento");
        System.out.println("Ej:Dia 01=1");
        Scanner scanner1=new Scanner(System.in);
        int dia=scanner1.nextInt();
        System.out.println("Ej:Mes 01=1");
        Scanner scanner2=new Scanner(System.in);
        int mes=scanner2.nextInt();
        System.out.println("Ej:año 2014");
        Scanner scanner3=new Scanner(System.in);
        int anio=scanner3.nextInt();
        int pasdo1=dia+mes+anio;//siempre 4 digitos XXXX
        String num=Integer.toString(pasdo1);
        char p1=num.charAt(0);
        char p2=num.charAt(1);
        char p3=num.charAt(2);
        char p4=num.charAt(3);
        int d1=Character.getNumericValue(p1);
        int d2=Character.getNumericValue(p2);
        int d3=Character.getNumericValue(p3);
        int d4=Character.getNumericValue(p4);
        int numFavorito=d1+d2+d3+d4;
        System.out.println("Tu número de suerte es:"+numFavorito);
    }
}
