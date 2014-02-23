/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.util.Scanner;

/**
 *hora 1-24
 *min  1-60
 * seg 1-60
 */
public class Ejemplo9 {
    public static void main(String[]args){
        System.out.println("introduce la hora hora");
        Scanner scanner1=new Scanner(System.in);
        int hora=scanner1.nextInt();
        
        System.out.println("introduce el minuto");
        Scanner scanner2=new Scanner(System.in);
        int min=scanner2.nextInt();
        
        System.out.println("introduce el segundo");
        Scanner scanner3=new Scanner(System.in);
        int seg=scanner3.nextInt();
        
        if(hora<1||hora>60 || min<0||min>60 || seg<0||seg>60 ){
            System.out.println("Ops!! fuera de rango");
        }else{
            System.out.println("La hora es h:m:s-->"+hora+":"+min+":"+seg);
        }
    }
}
